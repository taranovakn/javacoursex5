package ru.x5javacourse.hw3.Students;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork(){
        return scientificWork;
    }

    @Override
    public float getScholarship(Student student){
        int scholarship;
        if (averageMark == 5) {
            scholarship = 200;
        } else scholarship = 180;
        return scholarship;
    }
}
