package ru.x5javacourse.hw4.AreaOfTheFigures;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readDoubleFromKeyboard;

public class MainAreaOfTheFigures {

    public static void mainAreaOfTheFigures() throws IOException {
        Shape[] shape = new Shape[3];
        System.out.println("Введите длину 1й стороны треугольника:");
        double aTriangle = readDoubleFromKeyboard();
        System.out.println("Введите длину 2й стороны треугольника:");
        double bTriangle = readDoubleFromKeyboard();
        System.out.println("Введите длину 3й стороны треугольника:");
        double cTriangle = readDoubleFromKeyboard();
        shape[0] = new Triangle(aTriangle, bTriangle, cTriangle);

        System.out.println("Введите радиус круга:");
        double r = readDoubleFromKeyboard();
        shape[1] = new Circle(r);

        System.out.println("Введите длину прямоугольника:");
        double aRectangle = readDoubleFromKeyboard();
        System.out.println("Введите ширину прямоугольника");
        double bRectangle = readDoubleFromKeyboard();
        shape[2] = new Rectangle(aRectangle,bRectangle);

        for (Shape sh: shape){
            System.out.println("Площадь фигуры: " +sh.square());
        }
    }
}
