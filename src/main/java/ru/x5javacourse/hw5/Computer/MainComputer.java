package ru.x5javacourse.hw5.Computer;

import ru.x5javacourse.hw5.Computer.HardDisk.HardDiskFactory;
import ru.x5javacourse.hw5.Computer.VideoCard.VideoCardFactory;

import java.io.IOException;

import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;

public class MainComputer {
    public static void mainComputer() throws IOException {

        System.out.println("Какой тип компьютера вы хотите запустить? Домашний - 1; студенческий - 2; игровой - 3");
        int creationTypeOfComputer = readIntFromKeyboard();
        ComputerType computerType;
        
        switch (creationTypeOfComputer) {
            case 1:
                computerType = ComputerType.HOME_COMPUTER;
                break;
            case 2:
                computerType = ComputerType.GAMING_COMPUTER;
                break;
            case 3:
                computerType = ComputerType.STUDENT_COMPUTER;
                break;
            default:
                throw new IllegalStateException("Вы ввели некорректный тип компьютера: " + creationTypeOfComputer);
        }
        getComputer(computerType).startComputer();
    }

    public static Computer getComputer(ComputerType computerType) {
        Computer computer = new Computer();
        computer.addComponent(new RamFactory().createRam(computerType));
        computer.addComponent(new ProcessorFactory().createProcessor(computerType));
        computer.addComponent(new MonitorFactory().createMonitor(computerType));
        computer.addComponent(new VideoCardFactory().createVideoCard(computerType));
        computer.addComponent(new HardDiskFactory().createHardDisk(computerType));
        return computer;
        //computerFactory.createComputer();
    }
}
