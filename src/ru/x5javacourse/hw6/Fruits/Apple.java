package ru.x5javacourse.hw6.Fruits;

public class Apple extends Fruits {
    private final int randomWeigh = randomWeight();
    @Override
    public int getWeight() {
        return this.randomWeigh;
    }
}
