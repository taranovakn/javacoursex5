package ru.x5javacourse.hw3.Animals;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood(){
        return food;
    }
    public String getLocation() {
        return location;
    }
    public void sleep(){
        System.out.println("Животное спит, не тревожьте его ZzZz...");
    }
    public void eat(){
        System.out.println("Животное ест, не подходите, может укусить!");
    }
    public void makeNoise(){
        System.out.println("Животное издает звуки");
    }
}
