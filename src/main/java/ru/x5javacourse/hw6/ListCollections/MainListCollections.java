package ru.x5javacourse.hw6.ListCollections;

import java.io.IOException;
import java.util.Random;

import static ru.x5javacourse.hw2.HW2.readCountFromKeyboard;
import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;

public class MainListCollections {
    public static void mainListCollections() throws IOException {
        System.out.println("Какой вид реализации хотите проверить? 1 - на основе массива; 2 - на основе связанного списка.");
        int typeOfCollection = readCountFromKeyboard();
        switch (typeOfCollection) {
            case 1:
                NewArrayListCollection<Integer> newArrayListCollection = new NewArrayListCollection<>();
                useNewListCollectionMethod(newArrayListCollection);
                break;
            case 2:
                NewLinkedList<Integer> newLinkedList = new NewLinkedList<>();
                useNewListCollectionMethod(newLinkedList);
        }

    }
    public static void useNewListCollectionMethod(NewList<Integer> collection) throws IOException {
        System.out.println("Сколько рандомных значений добавить в list?");
        int randomCount = readCountFromKeyboard();

        if (randomCount > 0) {
            Random random = new Random();
            for (int i = 0; i < randomCount; i++) {
                collection.add(random.nextInt());
            }
            collection.printCollection();
        } else {
            System.out.println("Вы ввели некорректные данные.");
        }
        System.out.println("Выберите операцию, которую выходите выполнить к созданной коллекции:" + System.lineSeparator() +
                "1. Узнать размер коллекции; " + System.lineSeparator() +
                "2. Добавить элемент в коллекцию;" + System.lineSeparator() +
                "3. Удалить элемент коллекции по его индексу; " + System.lineSeparator() +
                "4. Удалить определенный элемент по его значению;" + System.lineSeparator() +
                "5. Получить элемент по индексу;" + System.lineSeparator() +
                "6. Очистить коллекцию;" + System.lineSeparator());
        int typeOfOperation = readIntFromKeyboard();
        switch (typeOfOperation) {
            case 1:
                System.out.println("Размер коллекции: " + collection.getSize() + ";");
                break;
            case 2:
                System.out.println("Введите добавляемое значение в коллекцию: ");
                collection.add(readIntFromKeyboard());
                collection.printCollection();
                break;
            case 3:
                System.out.println("Введите индекс удаляемого элемента: ");
                int removeIndex = readIntFromKeyboard();
                if (removeIndex >= 0) {
                    collection.remove(removeIndex);
                } else {
                    System.out.println("Вы ввели некорректный индекс");
                }
                collection.printCollection();
                break;
            case 4:
                System.out.println("Введите значение удаляемого элемента: ");
                collection.remove(readIntFromKeyboard());
                collection.printCollection();
                break;
            case 5:
                System.out.println("Введите индекс получаемого элемента: ");
                int getElementByIndex = readIntFromKeyboard();
                if (getElementByIndex >= 0) {
                    System.out.println(collection.getElement(getElementByIndex));
                } else {
                    System.out.println("Вы ввели некорректный индекс");
                }
                collection.printCollection();
                break;
            case 6:
                System.out.println("Вы выбрали очищение коллекции");
                collection.clear();
                collection.printCollection();
                break;
        }
    }
}
