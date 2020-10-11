package ru.x5javacourse.hw5.Computer;

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
        ComputerFactory computerFactory = null;
        switch (computerType) {
            case HOME_COMPUTER:
                computerFactory = new HomeComputerFactory();
                break;
            case STUDENT_COMPUTER:
                computerFactory = new StudentComputerFactory();
                break;
            case GAMING_COMPUTER:
                computerFactory = new GamingComputerFactory();
                break;
        }
        return computerFactory.createComputer();
    }
}
