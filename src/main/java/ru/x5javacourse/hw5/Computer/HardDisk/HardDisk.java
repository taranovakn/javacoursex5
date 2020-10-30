package ru.x5javacourse.hw5.Computer.HardDisk;

import ru.x5javacourse.hw5.Computer.Component;

public class HardDisk implements Component {
    private String hardDiskManufacturer;
    private int hardDiskAmountOfMemory;
    private HardDiskStrategy hardDiskTypeOfStorage;
    private double  hardDiskFormsFactor;

    public HardDisk(String hardDiskManufacturer, int hardDiskAmountOfMemory,
                    HardDiskStrategy hardDiskTypeOfStorage, double hardDiskFormsFactor) {
        this.hardDiskManufacturer = hardDiskManufacturer;
        this.hardDiskAmountOfMemory = hardDiskAmountOfMemory;
        this.hardDiskTypeOfStorage = hardDiskTypeOfStorage;
        this.hardDiskFormsFactor = hardDiskFormsFactor;
    }
    @Override
    public void start(){
        hardDiskTypeOfStorage.startTypeOfHardDisk();
        System.out.println("Жесткий диск запущен.");
    }

    @Override
    public String getInfo(){
        return "Параметры жесткого диска: " + "производитель - " +
                hardDiskManufacturer + "; объем памяти - " + hardDiskAmountOfMemory + "; форм-фактор - " +
                hardDiskFormsFactor + ";";
    }
}
