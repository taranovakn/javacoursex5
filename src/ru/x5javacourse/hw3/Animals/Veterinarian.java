package ru.x5javacourse.hw3.Animals;

public class Veterinarian {

    public static void treatAnimal(Animal animal){
        System.out.println("Употребляемая пища: " + animal.getFood() + "; Место обитания: " + animal.getLocation() + ";");
    }
}
