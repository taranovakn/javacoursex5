package ru.x5javacourse.hw5.Computer;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    public void startComputer(){
        for (Component component: components){
            System.out.println(component.getInfo());
            component.start();
        }
    }

}
