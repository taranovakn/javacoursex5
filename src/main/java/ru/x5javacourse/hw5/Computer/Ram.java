package ru.x5javacourse.hw5.Computer;

public class Ram {
    private String ramManufacturer;
    private int ramMemorySize;
    private double ramFrequency;
    private String ramMemoryType;

    public Ram(String ramManufacturer, int ramMemorySize, double ramFrequency, String ramMemoryType) {
        this.ramManufacturer = ramManufacturer;
        this.ramMemorySize = ramMemorySize;
        this.ramFrequency = ramFrequency;
        this.ramMemoryType = ramMemoryType;
    }

    public void startRam(){
        System.out.println("Оперативная память запущена. Параметры: " + "производитель - " +
                ramManufacturer + "; тип памяти - " +ramMemoryType + "; объем памяти - " +
                ramMemorySize + "; частота - " + ramFrequency);
    }

}
