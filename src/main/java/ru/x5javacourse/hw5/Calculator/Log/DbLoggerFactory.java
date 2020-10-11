package ru.x5javacourse.hw5.Calculator.Log;

public class DbLoggerFactory extends LoggerFactory{

    public Logger createLogger() {
        return new DbLogger();
    }
}
