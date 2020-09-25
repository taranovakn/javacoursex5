package ru.x5javacourse.hw5.Computer;

public class GamingComputerFactory extends ComputerFactory {

    @Override
    public Computer createComputer() {
        return new GamingComputer();
    }
}
