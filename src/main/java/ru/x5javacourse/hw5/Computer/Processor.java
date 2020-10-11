package ru.x5javacourse.hw5.Computer;

public class Processor {
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

    public void startProcessor(){
        System.out.println("Процессор запущен. Параметры: " + "производитель - " +
                processorManufacturer + "; название - " + processorName + "; тактовая частота - " +
                processorClockSpeed + "; количество ядер - " + processorNumberOfCores +
                "; объем кеш-памяти - " + processorCacheMemory + ";");
    }
}
