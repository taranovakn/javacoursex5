package ru.x5javacourse.hw3.Students;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork(){
        return scientificWork;
    }

    @Override
    public double getScholarship(){
        int scholarship;
        if (getAverageMark() == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }
}
