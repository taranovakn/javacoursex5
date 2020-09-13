package ru.x5javacourse.hw4.Cars;

public class Lorry extends Car{
    double payloadCapacity; //грузоподьемность

    public Lorry(double payloadCapacity, String brand, String classOfTheCar, double weight, Engine engine) {
        super(brand,classOfTheCar, weight, engine);
        this.payloadCapacity = payloadCapacity;
    }
    public double getPayloadCapacity(){
        return payloadCapacity;
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал.");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о грузовике:");
        System.out.println("Максимальная грузоподъемность грузовика: "+ getPayloadCapacity() + "т.; бренд: "
                + getBrand() + "; класс грузовика: " + getClassOfTheCar() + "; вес автомобиля: " + getWeight() + "т.;");
        engine.printInfo();
        System.out.println("Автомобиль в движении: ");
        start();
        turnRight();
        turnLeft();
        turnRight();
        stop();
    }
}
