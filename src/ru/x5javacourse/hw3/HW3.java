package ru.x5javacourse.hw3;

public class HW3 {
    public static void hw3() {
        Phone phone1stCaller = new Phone(9178889999L, "samsung", 80);
        Phone phone2ndCaller = new Phone(9001234566L, "iphone", 50);
        Phone phone3rdCaller = new Phone(9534025837L, "huawei", 75);

        System.out.println("1 экземпляр: номер - " + phone1stCaller.getNumber() + "; модель - " +
                phone1stCaller.getModel() + "; вес - " + phone1stCaller.getWeight() + ".");
        System.out.println("2 экземпляр: номер - " + phone2ndCaller.getNumber() + "; модель - " +
                phone2ndCaller.getModel() + "; вес - " + phone2ndCaller.getWeight() + ".");
        System.out.println("3 экземпляр: номер - " + phone3rdCaller.getNumber() + "; модель - " +
                phone3rdCaller.getModel() + "; вес - " + phone3rdCaller.getWeight() + ".");

        System.out.println(phone1stCaller.receiveCall("София"));
        System.out.println(phone2ndCaller.receiveCall("Мирослав"));
        System.out.println(phone3rdCaller.receiveCall("Игорь"));

        System.out.println(phone1stCaller.receiveCall("София", phone1stCaller.getNumber()));

        phone1stCaller.sendMessage(9678965436L, 9879857647L, 9475637874L);
        phone1stCaller.sendMessage(phone2ndCaller.getNumber());
        phone1stCaller.sendMessage(946573876L,9898987898L,9876789809L,9870989878L);
    }
}
