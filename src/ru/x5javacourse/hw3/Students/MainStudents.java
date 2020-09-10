package ru.x5javacourse.hw3.Students;

import ru.x5javacourse.hw3.Animals.Animal;
import ru.x5javacourse.hw3.Animals.Veterinarian;

public class MainStudents {
    public static void mainStudents(){

        Student aspirant = new Aspirant("Sofia", "Gutnik", "4211-21", 4.90,
                "Алхимическое влияние на окружающий мир в условиях игровой реальности");
        System.out.println("Переменная типа Student, которая ссылается на объект типа Aspirant: " + aspirant.getFirstName() + " " +
                aspirant.getLastName() + " ; группа " + aspirant.getGroup() + "; " +
                "средний балл за успеваемость: " + aspirant.getAverageMark() + "; стипендия: $" +
                aspirant.getScholarship(aspirant) + ";" +
                System.lineSeparator()+"Научная работа на тему:" + ((Aspirant) aspirant).getScientificWork());

        Student[] students = new Student[6];
        students[0] = new Student("Ilya", "Tokarev", "4121-11", 5);
        students[1] = new Student("Vladimir", "Kukushkin", "4001-01", 4.45);
        students[2] = new Student("Lilya", "Lopyreva", "4231-11", 3.6);
        students[3] = new Aspirant("Alina", "Rakhimova", "5671-A1", 4.3,
                "Действие руны огня на защитный щит странников Нарнии");
        students[4] = new Aspirant("Igor", "Svetozarov", "6435-45", 3.7,
                "Значение персонажа Сандора в реалиях современной культуры");
        students[5] = new Aspirant("Kamilia", "Galiamova", "4000-B1", 5,
                "Статистический анализ боевых умений Красного принца и Аделлии");

        System.out.println("Перебор всех учащихся и вывод данных о них. ");
        for (Student student : students)
        {
            if (student instanceof Aspirant)
            {
                System.out.println("Информация о студенте" + ": " + student.getFirstName() + " " +
                        student.getLastName() + " ; группа " + student.getGroup() + "; " +
                        "средний балл за успеваемость: " + student.getAverageMark() + "; стипендия: $" +
                        student.getScholarship(student) + ";" +
                        System.lineSeparator()+"Научная работа на тему:" + ((Aspirant) student).getScientificWork());
            } else {
            System.out.println("Информация о студенте" + ": " + student.getFirstName() + " " +
                            student.getLastName() + " ; группа " + student.getGroup() + "; " +
                            "средний балл за успеваемость: " + student.getAverageMark() + "; стипендия: $" +
                    student.getScholarship(student));
            }
        }

    }
}
