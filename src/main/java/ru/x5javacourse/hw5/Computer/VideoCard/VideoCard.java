package ru.x5javacourse.hw5.Computer.VideoCard;

import ru.x5javacourse.hw5.Computer.Component;

public class VideoCard implements Component {
    private String videoCardManufacturer;
    private String videoCardMemoryType;
    private int videoCardVolumeMemory;
    private VideoCardStrategy videoCardCooling; //добавить стратегию активное или пассивное охлаждение

    public VideoCard(String videoCardManufacturer, String videoCardMemoryType,
                     int videoCardVolumeMemory, VideoCardStrategy videoCardCooling) {
        this.videoCardManufacturer = videoCardManufacturer;
        this.videoCardMemoryType = videoCardMemoryType;
        this.videoCardVolumeMemory = videoCardVolumeMemory;
        this.videoCardCooling = videoCardCooling;
    }
    @Override
    public void start(){
        videoCardCooling.startCooling();
        System.out.println("Видеокарта запущена.");
    }

    @Override
    public String getInfo(){
        return "Параметры видеокарты: " + "производитель - " +
                videoCardManufacturer + "; тип памяти - " +videoCardMemoryType + "; объем памяти - " +
                videoCardVolumeMemory + ";";
    }
}
