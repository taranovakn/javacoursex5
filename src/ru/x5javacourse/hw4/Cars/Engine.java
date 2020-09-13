package ru.x5javacourse.hw4.Cars;

public class Engine {
    private int powerOfEngine;
    private String manufacturer;

    public Engine(int powerOfEngine, String manufacturer) {
        this.powerOfEngine = powerOfEngine;
        this.manufacturer = manufacturer;
    }

    public int getPowerOfEngine(){
        return powerOfEngine;
    }
    public String getManufacturer(){ return manufacturer; }

    public void printInfo(){
        System.out.println("Информация о моторе: мощность: "+ getPowerOfEngine() + "л.с.;  производитель: "
                + getManufacturer() + ";");
    }
}
