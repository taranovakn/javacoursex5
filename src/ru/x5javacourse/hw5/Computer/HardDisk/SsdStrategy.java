package ru.x5javacourse.hw5.Computer.HardDisk;

public class SsdStrategy implements HardDiskStrategy{

    @Override
    public void startTypeOfHardDisk() {
        System.out.println("Запущен SSD-диск.");
    }
}
