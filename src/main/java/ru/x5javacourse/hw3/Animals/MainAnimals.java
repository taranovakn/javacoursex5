package ru.x5javacourse.hw3.Animals;

public class MainAnimals {

    public static void mainAnimals(){

        Animal[] animals = new Animal[6];
        animals[0] = new Cat("Сухой корм для кошек", "Квартира", 5, 7);
        animals[1] = new Dog("Сухой корм для собак", "Будка",  25, 50);
        animals[2] = new Horse("Трава", "Конюшня", 97, "Подкована");
        animals[3] = new Cat("Гипоаллергенный корм для кошек", "Дом", 7, 5);
        animals[4] = new Dog("Гипоаллергенный корм для собак", "Квартира",  50, 45);
        animals[5] = new Horse("Трава", "Конюшня", 135, "Не подкована");
        Veterinarian v = new Veterinarian();
        for (int i = 0; i<animals.length;i++) {
            System.out.println("Информация о пришедшем на прием животном " + (i+1) +":");
            v.treatAnimal(animals[i]);
        }
    }
}
