package ru.x5javacourse.hw5;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;
import static ru.x5javacourse.hw5.Calculator.MainCalculator.mainCalculator;
import static ru.x5javacourse.hw5.Computer.MainComputer.mainComputer;

public class HW5 {
    public static void hw5() throws IOException {
        System.out.println("Какое задание в 5 домашнем задании хотите проверить 1 или 2? " +
                "Введите с клавиатуры 1 или 2");

        int hw5 = readIntFromKeyboard();
        switch (hw5){
            case 1:
                mainCalculator();
                break;
            case 2:
                mainComputer();
                break;
            default:
                throw new IllegalStateException("Значение не корректное: " + hw5);
        }
    }
}
