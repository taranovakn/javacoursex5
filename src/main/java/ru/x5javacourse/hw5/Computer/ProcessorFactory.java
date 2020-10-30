package ru.x5javacourse.hw5.Computer;


public class ProcessorFactory {

    public Component createProcessor(ComputerType computerType){
        Processor processor;
        switch (computerType) {
            case HOME_COMPUTER:
                processor = new Processor(3.4, 8, 4, "Core", "AMD");
                break;
            case STUDENT_COMPUTER:
                processor = new Processor(3.4, 4, 4, "Core", "AMD");
              break;
            case GAMING_COMPUTER:
                processor = new Processor(3.4, 4, 2, "Athlon", "Intel");
                break;
            default:
                throw new IllegalStateException("Некорректный тип создаваемого компьютера: " + computerType);
        }
        return processor;
    }
}
