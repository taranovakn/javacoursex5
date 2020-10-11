package ru.x5javacourse.hw6.Fruits;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Fruits {

    public abstract int getWeight();

    public int randomWeight(){ //сделала int, чтобы в граммах было
            int rangeMin = 120;
            int rangeMax = 350;
            int randomWeight = ThreadLocalRandom.current().nextInt(rangeMin,rangeMax+1);
            return randomWeight;
    }
}
