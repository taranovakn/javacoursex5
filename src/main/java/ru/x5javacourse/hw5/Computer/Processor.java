package ru.x5javacourse.hw5.Computer;

public class Processor implements Component{
    private double processorClockSpeed; //тактовая частота
    private int processorNumberOfCores; //количество ядер
    private int processorCacheMemory; //кэш-память
    private String  processorName; //название
    private String processorManufacturer; //производитель

    public Processor(double processorClockSpeed, int processorNumberOfCores,
                     int processorCacheMemory, String processorName, String processorManufacturer) {
        this.processorClockSpeed = processorClockSpeed;
        this.processorNumberOfCores = processorNumberOfCores;
        this.processorCacheMemory = processorCacheMemory;
        this.processorName = processorName;
        this.processorManufacturer = processorManufacturer;
    }

    @Override
    public void start(){
        System.out.println("Процессор запущен.");
    }

    @Override
    public String getInfo(){
        return "Параметры процессора: " + "производитель - " +
                processorManufacturer + "; название - " + processorName + "; тактовая частота - " +
                processorClockSpeed + "; количество ядер - " + processorNumberOfCores +
                "; объем кеш-памяти - " + processorCacheMemory + ";";
    }
}
