package ru.x5javacourse.hw4.Cars;

public abstract class Car {
    String brand;
    String classOfTheCar;
    double weight;
    Engine engine;

    public Car(String brand, String classOfTheCar, double weight, Engine engine) {
        this.brand = brand;
        this.classOfTheCar = classOfTheCar;
        this.weight = weight;
        this.engine = engine;
    }

    public String getBrand(){return brand;}
    public String getClassOfTheCar(){ return classOfTheCar;}
    public double getWeight(){
        return weight;
    }
    public Engine getEngine(){return engine;}


    abstract void start();
    abstract void stop();

    public void turnRight(){
        System.out.println("Поворот направо.");
    }

    public void turnLeft(){
        System.out.println("Поворот налево.");
    }

    public abstract void printInfo();

}
