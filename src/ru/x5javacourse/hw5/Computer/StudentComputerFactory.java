package ru.x5javacourse.hw5.Computer;

public class StudentComputerFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new StudentComputer();
    }
}
