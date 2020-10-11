package ru.x5javacourse.hw5.Computer;

public class HomeComputerFactory extends ComputerFactory{

    @Override
    public Computer createComputer() {
        return new HomeComputer();
    }
}
