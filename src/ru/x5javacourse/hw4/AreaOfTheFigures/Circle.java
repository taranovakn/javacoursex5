package ru.x5javacourse.hw4.AreaOfTheFigures;


public class Circle implements Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double square() {
        return 3.14 * Math.pow(r,2);
    }
}
