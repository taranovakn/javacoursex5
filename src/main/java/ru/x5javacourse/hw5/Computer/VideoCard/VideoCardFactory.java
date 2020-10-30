package ru.x5javacourse.hw5.Computer.VideoCard;

import ru.x5javacourse.hw5.Computer.Component;
import ru.x5javacourse.hw5.Computer.ComputerType;
import ru.x5javacourse.hw5.Computer.Monitor;

public class VideoCardFactory {

    public Component createVideoCard(ComputerType computerType){
        VideoCard videoCard;
        switch (computerType) {
            case HOME_COMPUTER:
                videoCard = new VideoCard("Nvidia", "DDR3", 8, new PassiveCooling());
                break;
            case STUDENT_COMPUTER:
                videoCard = new VideoCard("Asus", "GDDR5", 12, new ActiveCooling());
                break;
            case GAMING_COMPUTER:
                videoCard = new VideoCard("Nvidia", "DDR", 6, new ActiveCooling());
                break;
            default:
                throw new IllegalStateException("Некорректный тип создаваемого компьютера: " + computerType);
        }
        return videoCard;
    }
}
