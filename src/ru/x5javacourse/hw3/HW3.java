package ru.x5javacourse.hw3;

import ru.x5javacourse.hw3.Animals.*;
import ru.x5javacourse.hw3.Phone.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ru.x5javacourse.hw2.HW2.readIntFromKeyboard;
import static ru.x5javacourse.hw3.Animals.MainAnimals.mainAnimals;
import static ru.x5javacourse.hw3.Phone.MainPhone.mainPhone;
import static ru.x5javacourse.hw3.Students.MainStudents.mainStudents;

public class HW3 {
    public static void hw3() throws IOException {

        System.out.println("Какое класс хотите проверить Phone, Animals или Students? " +
                "Введите с клавиатуры 1, 2 или 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hw3 = readIntFromKeyboard();
        switch (hw3){
            case 1:
                mainPhone();
                break;
            case 2:
                mainAnimals();
                break;
            case 3:
                mainStudents();
                break;
            default:
                throw new IllegalStateException("Значение не корректное: " + hw3);
        }
    }
}
