package ru.x5javacourse.hw7;


public class Account {
    private final int id; // счет
    private final int holderId; // владелец счета
    private double amount; //баланс счета

    public Account(int id, int holderId, double amount) {
        this.id = id;
        this.holderId = holderId;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }

    public int getHolderId() {
        return holderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount){
        this.amount = newAmount;
    }
}
