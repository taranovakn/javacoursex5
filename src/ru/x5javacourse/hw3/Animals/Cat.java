package ru.x5javacourse.hw3.Animals;

public class Cat extends Animal {

    int nightVisionDistance; // дистанция ночного видения котов
    int climbingTrees; //высота дерева, на сколько высоко может кот забраться

    public Cat(String food, String location, int nightVisionDistance, int climbingTrees) {
        super(food, location);
        this.nightVisionDistance = nightVisionDistance;
        this.climbingTrees = climbingTrees;
    }
    public int getNightVisionDistance(){
        return nightVisionDistance;
    }
    public int getClimbingTrees(){
        return climbingTrees;
    }
    @Override
    public void sleep(){
        System.out.println("Кот спит, не тревожьте его ZzZz...");
    }

    @Override
    public void eat(){
        System.out.println("Кот ест, не подходите, может укусить!");
    }

    @Override
    public void makeNoise(){
        System.out.println("Кот мяукает.");
    }


}
