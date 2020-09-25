package ru.x5javacourse.hw5.Computer.VideoCard;

public class VideoCard {
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
    public void startVideoCard(){
        System.out.println("Видеокарта запущена. Параметры: " + "производитель - " +
                videoCardManufacturer + "; тип памяти - " +videoCardMemoryType + "; объем памяти - " +
                videoCardVolumeMemory + ";");
        videoCardCooling.startCooling();
    }
}
