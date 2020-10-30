package ru.x5javacourse.hw5.Computer;

public class MonitorFactory  {

    public Component createMonitor(ComputerType computerType){
        Monitor monitor;
        switch (computerType) {
            case HOME_COMPUTER:
                monitor = new Monitor(17, "Samsung");
                break;
            case STUDENT_COMPUTER:
                monitor = new Monitor(22, "Lenovo");
                break;
            case GAMING_COMPUTER:
                monitor = new Monitor(24, "ACER");
                break;
            default:
                throw new IllegalStateException("Некорректный тип создаваемого компьютера: " + computerType);
        }
        return monitor;
    }
}
