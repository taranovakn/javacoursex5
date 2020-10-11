package ru.x5javacourse.hw5.Calculator.Log;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("FileLogger – Log into file: " + message);
    }
}
