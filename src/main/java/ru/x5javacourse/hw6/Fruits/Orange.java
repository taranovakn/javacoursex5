package ru.x5javacourse.hw6.Fruits;


public class Orange extends Fruits {
    private final int randomWeigh = randomWeight();

    public int getWeight() {
        return this.randomWeigh;
    }
}
