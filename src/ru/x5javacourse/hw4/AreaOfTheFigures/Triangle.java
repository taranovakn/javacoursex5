package ru.x5javacourse.hw4.AreaOfTheFigures;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readDoubleFromKeyboard;

public class Triangle implements Shape {

    public double square() throws IOException {
        System.out.println("Введите длину 1й стороны треугольника:");
        double a = readDoubleFromKeyboard();
        System.out.println("Введите длину 2й стороны треугольника:");
        double b = readDoubleFromKeyboard();
        System.out.println("Введите длину 3й стороны треугольника:");
        double c = readDoubleFromKeyboard();

        double p = (a + b + c) / 2; //полупериметр
        double triangle = Math.sqrt( p * (p - a) * (p - b)* (p - c));
        return  triangle;
    }
}
