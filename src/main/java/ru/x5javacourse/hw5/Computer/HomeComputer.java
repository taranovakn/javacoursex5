package ru.x5javacourse.hw5.Computer;

import ru.x5javacourse.hw5.Computer.HardDisk.HardDisk;
import ru.x5javacourse.hw5.Computer.HardDisk.HddStrategy;
import ru.x5javacourse.hw5.Computer.HardDisk.SsdStrategy;
import ru.x5javacourse.hw5.Computer.VideoCard.ActiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.PassiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.VideoCard;

public class HomeComputer implements Computer {
    private Processor processor = new Processor(3.4, 8, 4,
            "Core", "AMD");
    private Ram ram = new Ram("Transcent", 4, 1033, "SO-DIMM");
    private HardDisk hardDisk = new HardDisk("WD", 1024, new SsdStrategy(), 2.5);
    private Monitor monitor = new Monitor(17, "Samsung");
    private VideoCard videoCard = new VideoCard("Nvidia", "DDR3", 8, new PassiveCooling());

    @Override
    public void startComputer(){
        processor.startProcessor();
        ram.startRam();
        hardDisk.startHardDisk();
        videoCard.startVideoCard();
        monitor.startMonitor();

    }
}
