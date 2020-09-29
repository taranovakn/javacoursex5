package ru.x5javacourse.hw6.ListCollections;

public class NewArrayListCollection<E> implements NewList<E>{

    private Object[] dataForList = new Object[0];


    public void add(E element){
        add(getSize(), element);
    }

    private void add(int index, E element) {
        Object[] result = (E[]) new Object[getSize()+1];
        for (int i = 0; i < index; i++) {
            result[i] = dataForList[i];
        }
        for (int i = index+1;i < result.length; i++){
            result[i] = dataForList[i-1];
        }
        result[index] = element;
        dataForList = result;
    }


    public void remove(int index) {
        Object[] result = (E[]) new Object[getSize() - 1];
        for (int i = 0; i < index; i++) {
            result[i] = dataForList[i];
        }
        for (int i = index;i < result.length; i++){
            result[i] = dataForList[i+1];
        }
        this.dataForList = result;
    }

    public void remove(E item){
        int itemIndex = -1;
        for (int i = 0; i < getSize(); i++){
            if (dataForList[i].equals(item)){
                itemIndex = i;
                break;
            }
        }
        if (itemIndex != -1){
            remove(itemIndex);
        }
    }


    public int getSize(){
        return dataForList.length;
    }

    public E getElement (int index){
        return (E) dataForList[index];
    }

    public void clear(){
        for (int i = 0; i < getSize(); i++) {
            dataForList[i] = null;
        }
    }

    public void printCollection(){
        StringBuilder toPrint = new StringBuilder();
        for (int i = 0; i < getSize(); i++){
            toPrint.append(dataForList[i].toString()).append("; ");
        }
        System.out.println("Итоговая коллекция: " + toPrint);
    }
}
