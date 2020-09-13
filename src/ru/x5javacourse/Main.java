package ru.x5javacourse;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ru.x5javacourse.hw2.HW2.*;
import static ru.x5javacourse.hw3.HW3.hw3;
import static ru.x5javacourse.hw4.HW4.hw4;

public class Main {
    public static void main(String [] args) throws IOException
    {
        boolean continueAnswer = true;

        while (continueAnswer){
            System.out.println("Какое домашнее задание хотите проверить? Введите с клавиатуры: 1, 2, 3, 4 или 5. ");

            int hw = readIntFromKeyboard();

            switch (hw) {
                case 1: // 1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
                    System.out.println("Hello world!");
                    break;
                case 2:
                    hw2Choosing();
                    break;
                case 3:
                    hw3();
                    break;
                case 4:
                    hw4();
                    break;
                case 5:
                    System.out.println("Здесь будет ДЗ-5");
                    break;
            }
            continueAnswer = continueProgram();
        }
        System.out.println("Завершение программы.");
    }

    public static Boolean continueProgram() throws IOException {
        System.out.println("Хотите продолжить и проверить другое задание? Y - продолжить, N - завершить программу");
        boolean continueProgram = false;
        boolean isNotCorrectInput = true;
        while (isNotCorrectInput) {
                String continueAnswer = readerFromKeyboard();
                if (continueAnswer.equals("Y")){
                    continueProgram = true;
                    isNotCorrectInput = false;
                } else
                    if (continueAnswer.equals("N")){
                        continueProgram = false;
                        isNotCorrectInput = false;
                    }
                    else System.out.println("Введите Y или N.");;
        }
        return continueProgram;
    }
}
