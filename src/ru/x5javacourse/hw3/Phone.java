package ru.x5javacourse.hw3;

public class Phone {

    private long number;
    private String model;
    private double weight;


    public Phone(long number, String model, double weight) {
        this(number,model);
        this.weight = weight;

    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }


    public long getNumber(){
        return number;
    }

    public String getModel(){
        return model;
    }
    public double getWeight(){
        return weight;
    }
    public String receiveCall(String callerName){
        return "Звонит " + callerName;
    }
    public String receiveCall(String callerName,long number){
        return "Звонит " + callerName + " номер: " + number;
    }
    public void sendMessage(long... number){
        String numberPrint="";
        for (long l : number) {
            numberPrint += l + "; ";
            System.out.println(numberPrint);
        }

    }

}
