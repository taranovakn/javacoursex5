package ru.x5javacourse.hw6.ListCollections;


public class NewLinkedList<E> implements NewList<E> {
    NewNode<E> first;
    NewNode<E> last;
    private int size = 0;

    @Override
    public void add(E element) {
        NewNode<E> l = last;
        NewNode<E> newNode = new NewNode<>(l, element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }


    @Override
    public void remove(int index) {
        unlink((NewNode<E>) getElement(index));
    }

    private void unlink (NewNode<E> e){

        NewNode<E> next = e.next;
        NewNode<E> prev = e.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            e.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }

        e.item = null;
        size--;
    }

    @Override
    public void printCollection() {
        StringBuilder toPrint = new StringBuilder();
        for (int i = 0; i < size; i++){
            toPrint.append(getElement(i).toString()).append("; ");
        }
        System.out.println("Итоговая коллекция: " + toPrint);
    }

    @Override
    public void remove(E item) {
        if (item == null) {
            for (NewNode<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                }
            }
        } else {
            for (NewNode<E> x = first; x != null; x = x.next) {
                if (item.equals(x.item)) {
                    unlink(x);
                }
            }
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E getElement(int index) {
        NewNode<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x.item;
    }

    @Override
    public void clear() {
        last = null;
        first = null;
        size = 0;
    }

    private static class NewNode<E>{
        E item;
        NewNode<E> next;
        NewNode<E> prev;

        NewNode(NewNode<E> prev, E element, NewNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
