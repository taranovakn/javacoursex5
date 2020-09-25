package ru.x5javacourse.hw5.Calculator;

import ru.x5javacourse.hw5.Calculator.Log.*;

import java.io.IOException;
import java.util.Scanner;

import static ru.x5javacourse.hw2.HW2.*;

public class MainCalculator {

    public static void mainCalculator() throws IOException {
        System.out.println("Вы перешли в режим калькулятора");
        System.out.println("Введите первое число: ");
        double a = readDoubleFromKeyboard();
        char operation = getOperation();
        System.out.println("Введите второе число: ");
        double b = readDoubleFromKeyboard();

        LoggingType type;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите тип логирования: DbLogger, FileLogger или ConsoleLogger;");
            type = LoggingType.valueOf(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Вы ввели неверный тип логирования");
            return;
        }

        Logger logger = getLogger(type);

        switch (operation) {
            case '+':
                 addition(a, b, logger);
                break;
            case '-':
                subtraction(a, b, logger);
                break;
            case '*':
                multiplication(a, b, logger);
                break;
            case '/':
                division(a, b, logger);
                break;
        }

    }

    public static void addition (double a, double b, Logger logger){
        double result = a + b;
        logger.log("Выполнена операция сложения " + a + " и " + b + "; Результат: " + result);
    }

    public static void division (double a, double b, Logger logger){
        double result = a / b;
        logger.log("Выполнена операция деления " + a + " и " + b + "; Результат: " + result);
    }

    public static void subtraction(double a, double b, Logger logger){
        double result = a - b;
        logger.log("Выполнена операция вычитания " + a + " на " + b + "; Результат: " + result);
    }

    public static void multiplication(double a, double b, Logger logger){
        double result = a * b;
        logger.log("Выполнена операция умножения " + a + " на " + b + "; Результат: " + result);
    }


    public static char getOperation() throws IOException {
        System.out.println("Введите операцию: +, -, *, /.");
        char operation = readerFromKeyboard().charAt(0);
        switch (operation) {
            case '+':
            case '-':
            case '*':
            case '/':
                return operation;
            default:
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getOperation();
        }
        return operation;
    }
    public static Logger getLogger(LoggingType loggingType) {
        LoggerFactory loggerFactory = null;
        switch (loggingType) {
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
