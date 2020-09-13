package ru.x5javacourse.hw4.AreaOfTheFigures;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readDoubleFromKeyboard;

public class Rectangle implements Shape {
    public double square() throws IOException {

        System.out.println("Введите длину прямоугольника:");
        double a = readDoubleFromKeyboard();
        System.out.println("Введите ширину прямоугольника");
        double b = readDoubleFromKeyboard();

        double rectangle = a * b;
        return rectangle;
    }
}
