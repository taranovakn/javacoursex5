package ru.x5javacourse.hw4;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;
import static ru.x5javacourse.hw4.AreaOfTheFigures.MainAreaOfTheFigures.mainAreaOfTheFigures;
import static ru.x5javacourse.hw4.Cars.MainCars.mainCars;

public class HW4 {
    public static void hw4() throws IOException {
        System.out.println("Какое задание в 4 домашнем задании хотите проверить 1 или 2? " +
                "Введите с клавиатуры 1 или 2");

        int hw4 = readIntFromKeyboard();
        switch (hw4){
            case 1:
                mainAreaOfTheFigures();
                break;
            case 2:
                mainCars();
                break;
            default:
                throw new IllegalStateException("Значение не корректное: " + hw4);
        }
    }
}
