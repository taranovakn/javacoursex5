package ru.x5javacourse.hw4.AreaOfTheFigures;

public class Rectangle implements Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double square() {
        return a * b;
    }
}
