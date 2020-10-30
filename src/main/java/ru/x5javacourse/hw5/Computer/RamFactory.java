package ru.x5javacourse.hw5.Computer;


public class RamFactory  {
    public Component createRam(ComputerType computerType){
        Ram ram;
        switch (computerType) {
            case HOME_COMPUTER:
                ram = new Ram("Transcent", 4, 1033, "SO-DIMM");
                break;
            case STUDENT_COMPUTER:
                ram = new Ram("Corsair", 4, 533, "SO-DIMM");                break;
            case GAMING_COMPUTER:
                ram = new Ram("Samsung", 8, 533, "DIMM");
                break;
            default:
                throw new IllegalStateException("Некорректный тип создаваемого компьютера: " + computerType);
        }
        return ram;
    }
}
