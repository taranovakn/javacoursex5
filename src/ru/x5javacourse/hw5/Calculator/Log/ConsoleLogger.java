package ru.x5javacourse.hw5.Calculator.Log;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger – Log into console: " + message);
    }
}
