package ru.x5javacourse.hw4.AreaOfTheFigures;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readDoubleFromKeyboard;

public class Circle implements Shape {

    public double square() throws IOException {

        System.out.println("Введите радиус круга:");
        double r = readDoubleFromKeyboard();

        double circle = 3.14 * Math.pow(r,2);
        return circle;
    }
}
