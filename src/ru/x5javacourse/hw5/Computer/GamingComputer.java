package ru.x5javacourse.hw5.Computer;

import ru.x5javacourse.hw5.Computer.HardDisk.HardDisk;
import ru.x5javacourse.hw5.Computer.HardDisk.HddStrategy;
import ru.x5javacourse.hw5.Computer.VideoCard.ActiveCooling;
import ru.x5javacourse.hw5.Computer.VideoCard.VideoCard;

public class GamingComputer implements Computer {
    private Processor processor = new Processor(3.4, 4, 2,
            "Athlon", "Intel");
    private Ram ram = new Ram("Samsung", 8, 533, "DIMM");
    private HardDisk hardDisk = new HardDisk("Seagate", 500, new HddStrategy(), 2.5);
    private Monitor monitor = new Monitor(24, "ACER");
    private VideoCard videoCard = new VideoCard("Nvidia", "DDR", 6, new ActiveCooling());

    @Override
    public void startComputer(){
        processor.startProcessor();
        ram.startRam();
        hardDisk.startHardDisk();
        videoCard.startVideoCard();
        monitor.startMonitor();

    }
}
