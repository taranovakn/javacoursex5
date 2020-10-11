package ru.x5javacourse.hw6.Fruits;

import java.util.ArrayList;

public class Box <E extends Fruits> {

    ArrayList<E> fruitsBox = new ArrayList<>();

    public int getWeight(){
        int totalWeight = 0;
        for (E fruit: fruitsBox){
            totalWeight+=fruit.getWeight();
        }
        return totalWeight;
    }
    public void addFruit(E element){
        fruitsBox.add(element);
    }

    // Внутри класса Box сделать метод Compare, который позволяет
    //сравнить текущую коробку с той, которую подадут в Compare в
    //качестве параметра. True – если их массы равны, False в
    //противоположном случае. Можно сравнивать коробки с яблоками и
    //апельсинами;

    public boolean compare(Box <? extends Fruits> newBoxToCompare){
        double currentBox = this.getWeight();
        double boxToCompareWith = newBoxToCompare.getWeight();
        if (currentBox == boxToCompareWith){
            return true;
        } else {
        return false;
        }
    }

    // Написать метод, который позволяет пересыпать фрукты из текущей
    //коробки в другую. Помним про сортировку фруктов: нельзя яблоки
    //высыпать в коробку с апельсинами. Соответственно, в текущей
    //коробке фруктов не остается, а в другую перекидываются объекты,
    //которые были в первой;
    public void moveFruits(){

    }
}
