package ru.x5javacourse.hw5.Calculator.Log;

public class ConsoleLoggerFactory extends LoggerFactory{

    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
