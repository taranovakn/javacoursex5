package ru.x5javacourse.hw4.Cars;


public class MainCars {
    public static void mainCars(){
        Lorry lorry = new Lorry(11.5, "Scania", "Truck", 17,
                new Engine(730, "Scania corporation"));
        SportCar sportCar = new SportCar(410, "Ferrari", "Supercar", 2.9,
                new Engine(560, "Ferrari corporation"));
        lorry.printInfo();
        sportCar.printInfo();
    }
}
