package ru.x5javacourse.hw3.Students;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGroup(){
        return group;
    }

    public double getAverageMark(){
        return averageMark;
    }

    public double getScholarship(){
        int scholarship;
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}
