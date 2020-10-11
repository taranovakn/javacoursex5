package ru.x5javacourse.hw4.AreaOfTheFigures;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double p = (a + b + c) / 2; //полупериметр
        return Math.sqrt( p * (p - a) * (p - b)* (p - c));
    }
}
