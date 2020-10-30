package ru.x5javacourse.hw5.Computer.HardDisk;

import ru.x5javacourse.hw5.Computer.Component;
import ru.x5javacourse.hw5.Computer.ComputerType;
import ru.x5javacourse.hw5.Computer.VideoCard.ActiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.PassiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.VideoCard;

public class HardDiskFactory {

    public Component createHardDisk(ComputerType computerType){
        HardDisk hardDisk;
        switch (computerType) {
            case HOME_COMPUTER:
                hardDisk = new HardDisk("WD", 1024, new SsdStrategy(), 2.5);
                break;
            case STUDENT_COMPUTER:
                hardDisk = new HardDisk("Seagate", 2024, new HddStrategy(), 3.5);
                break;
            case GAMING_COMPUTER:
                hardDisk = new HardDisk("Seagate", 500, new HddStrategy(), 2.5);                break;
            default:
                throw new IllegalStateException("Некорректный тип создаваемого компьютера: " + computerType);
        }
        return hardDisk;
    }
}
