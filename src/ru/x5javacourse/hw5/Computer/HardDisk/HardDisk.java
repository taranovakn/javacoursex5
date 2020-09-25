package ru.x5javacourse.hw5.Computer.HardDisk;

public class HardDisk {
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

    public void startHardDisk(){
        System.out.println("Жесткий диск запущен. Параметры: " + "производитель - " +
                hardDiskManufacturer + "; объем памяти - " + hardDiskAmountOfMemory + "; форм-фактор - " +
                hardDiskFormsFactor + ";");
        hardDiskTypeOfStorage.startTypeOfHardDisk();
    }

}
