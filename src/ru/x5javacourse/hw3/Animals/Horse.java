package ru.x5javacourse.hw3.Animals;

public class Horse extends Animal {
    int carryingCapacity; //грузоподьемность
    String  shodHorse; //подкованность

    public Horse(String food, String location, int carryingCapacity, String shodHorse) {
        super(food, location);
        this.carryingCapacity = carryingCapacity;
        this.shodHorse = shodHorse;
    }
    public int getCarryingCapacity(){
        return carryingCapacity;
    }
    public String getShodHorse() {
        return getShodHorse();
    }
    @Override
    public void sleep(){
        System.out.println("Лошадь спит, не тревожьте его ZzZz...");
    }

    @Override
    public void eat(){
        System.out.println("Лощадь ест, не подходите, может укусить!");
    }

    @Override
    public void makeNoise(){
        System.out.println("Лошадь ржет иго-го.");
    }

}
