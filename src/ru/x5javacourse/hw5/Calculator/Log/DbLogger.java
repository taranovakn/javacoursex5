package ru.x5javacourse.hw5.Calculator.Log;

public class DbLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("DbLogger – Log into database: " + message);
    }
}
