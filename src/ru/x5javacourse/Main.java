package ru.x5javacourse;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ru.x5javacourse.hw2.HW2.*;

public class Main {
    public static void main(String [] args) throws IOException
    {
        System.out.println("Какое домашнее задание хотите проверить? Введите с клавиатуры 1, 2 или 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int hw = readIntFromKeyboard();

        if (hw == 1)
        {
            System.out.println("Hello world!");
        }
        else
            if (hw == 2)
            {
                hw2_choosing();
            }
            else
                if (hw == 3)
                {
                    System.out.println("Здесь будет ДЗ-3");
                }
                else System.out.println("Перезапустите программу и выберите корректный номер домашнее задания на проверку");
        System.out.println("Конец");
    }
}
