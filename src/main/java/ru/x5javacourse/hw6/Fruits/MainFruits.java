package ru.x5javacourse.hw6.Fruits;

import java.util.concurrent.ThreadLocalRandom;

public class MainFruits {
    public static void mainFruits() {
        System.out.println("Складываем рандомное количество фруктов в коробки");
        int randomCountOfApple = ThreadLocalRandom.current().nextInt(1, 100);
        int randomCountOfOrange = ThreadLocalRandom.current().nextInt(1, 100);
        Box <Apple> appleBox = new Box<>();
        for (int i = 0; i <= randomCountOfApple; i++){
            appleBox.addFruit(new Apple());
        }
        System.out.println("Вес коробки c яблоками " + appleBox.getWeight() / 1000 + "кг.");

        Box <Orange> orangeBox = new Box<>();
        for (int i = 0; i <= randomCountOfOrange; i++){
            orangeBox.addFruit(new Orange());
        }
        orangeBox.getWeight();
        System.out.println("Вес коробки с апельсинами " + orangeBox.getWeight() / 1000 + "кг.");

        System.out.println("Сравним вес коробки с апельсинами с рандомной коробкой с фруктами: ");
        compareWithRandomBox(orangeBox);
        System.out.println("Сравним вес коробки с яблоками с рандомной коробкой с фруктами: ");
        compareWithRandomBox(appleBox);

        System.out.println("Сравним вес коробки с апельсинами с той же коробкой апельсинов, чтобы убедиться, что сравнение корректное. ");
        boolean result = orangeBox.compare(orangeBox);

        if (result){
            System.out.println("Коробки одинаково весят.");
        } else {
            System.out.println("Коробки не одинаковые.");
        }

    }
    public static void compareWithRandomBox(Box <? extends Fruits> fruitBox){
        int randomCountOfFruits = ThreadLocalRandom.current().nextInt(1, 100);
        int randomClassName = ThreadLocalRandom.current().nextInt(1, 2);
        boolean result;
        if (randomClassName == 1){
            Box <Apple> boxToCompare = new Box<>();
            for (int i = 0; i <= randomCountOfFruits; i++){
                boxToCompare.addFruit(new Apple());
            }
            result = fruitBox.compare(boxToCompare);
        } else {
            Box <Orange> boxToCompare = new Box<>();
            for (int i = 0; i <= randomCountOfFruits; i++){
                boxToCompare.addFruit(new Orange());
            }
            result = fruitBox.compare(boxToCompare);
        }

        if (result){
            System.out.println("Коробки одинаково весят.");
        } else {
            System.out.println("Коробки не одинаковые.");
        }
    }

}
