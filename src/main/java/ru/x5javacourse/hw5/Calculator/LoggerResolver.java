package ru.x5javacourse.hw5.Calculator;

import ru.x5javacourse.hw5.Calculator.Log.*;


public class LoggerResolver {

    public Logger getLogger(String type) {
        LoggingType loggerType;

        try{
        loggerType = LoggingType.valueOf(type);
        }
        catch (Exception e){
            System.out.println("Тип логгера некорректный.");
            return null;
        }
        LoggerFactory loggerFactory = null;

        switch (loggerType) {
            case DbLogger:
                loggerFactory = new DbLoggerFactory();
                break;
            case ConsoleLogger:
                loggerFactory = new ConsoleLoggerFactory();
                break;
            case FileLogger:
                loggerFactory = new FileLoggerFactory();
                break;
        }
        return loggerFactory.createLogger();
    }
}
