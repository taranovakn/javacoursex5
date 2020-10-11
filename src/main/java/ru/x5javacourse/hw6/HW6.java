package ru.x5javacourse.hw6;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;
import static ru.x5javacourse.hw6.Fruits.MainFruits.mainFruits;
import static ru.x5javacourse.hw6.ListCollections.MainListCollections.mainListCollections;

public class HW6 {
    public static void hw6() throws IOException {
        System.out.println("Какое задание в 6 домашнем задании хотите проверить 1 или 2? " +
                "Введите с клавиатуры 1 или 2");

        int hw6 = readIntFromKeyboard();
        switch (hw6) {
            case 1:
                mainListCollections();
                break;
            case 2:
                mainFruits();
                break;
            default:
                throw new IllegalStateException("Значение не корректное: " + hw6);
        }
    }
}
