package ru.x5javacourse.hw3.Animals;

public class Dog extends Animal {
    private int runDistance; //максимальное расстояние способное пробежать собака
    private int maxSpeed; //максимальная скорость разгона

    public Dog(String food, String location, int runDistance, int maxSpeed) {
        super(food, location);
        this.runDistance = runDistance;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void sleep(){
        System.out.println("Собака спит, не тревожьте его ZzZz...");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест, не подходите, может укусить!");
    }

    @Override
    public void makeNoise(){
        System.out.println("Собака гавкает.");
    }

}
