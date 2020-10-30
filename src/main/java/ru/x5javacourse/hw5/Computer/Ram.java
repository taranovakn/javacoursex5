package ru.x5javacourse.hw5.Computer;

public class Ram implements Component{
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

    @Override
    public void start(){
        System.out.println("Оперативная память запущена.");
    }

    @Override
    public String getInfo(){
        return "Параметры оперативной памяти: " + "производитель - " +
                ramManufacturer + "; тип памяти - " +ramMemoryType + "; объем памяти - " +
                ramMemorySize + "; частота - " + ramFrequency;
    }
}
