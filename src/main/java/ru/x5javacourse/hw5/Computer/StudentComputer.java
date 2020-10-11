package ru.x5javacourse.hw5.Computer;

import ru.x5javacourse.hw5.Computer.HardDisk.HardDisk;
import ru.x5javacourse.hw5.Computer.HardDisk.HddStrategy;
import ru.x5javacourse.hw5.Computer.VideoCard.ActiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.VideoCard;

public class StudentComputer implements Computer {
    private Processor processor = new Processor(3.4, 8, 4,
            "Core", "AMD");
    private Ram ram = new Ram("Corsair", 4, 533, "SO-DIMM");
    private HardDisk hardDisk = new HardDisk("Seagate", 2024, new HddStrategy(), 3.5);
    private Monitor monitor = new Monitor(22, "Lenovo");
    private VideoCard videoCard = new VideoCard("Asus", "GDDR5", 12, new ActiveCooling());

    @Override
    public void startComputer(){
        processor.startProcessor();
        ram.startRam();
        hardDisk.startHardDisk();
        videoCard.startVideoCard();
        monitor.startMonitor();

    }
}
