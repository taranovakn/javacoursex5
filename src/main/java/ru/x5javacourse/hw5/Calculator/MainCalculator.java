package ru.x5javacourse.hw5.Calculator;

import ru.x5javacourse.hw5.Calculator.Log.*;

import java.io.IOException;
import java.util.Scanner;

import static ru.x5javacourse.hw2.HW2.*;

public class MainCalculator {

    public static void mainCalculator() throws IOException {
        System.out.println("Вы перешли в режим калькулятора");
        Logger logger;
        do {
            Scanner scanner = new Scanner(System.in);
            String userLoggerInput = scanner.nextLine();
            LoggerResolver loggerResolver = new LoggerResolver();
            System.out.println("Введите тип логирования: DbLogger, FileLogger или ConsoleLogger;");
            logger = loggerResolver.getLogger(userLoggerInput);
        }
        while (logger == null);

        Calculation calculation = new Calculation(logger);
        System.out.println("Введите первое число: ");
        double a = readDoubleFromKeyboard();
        char operation = getOperation();
        System.out.println("Введите второе число: ");
        double b = readDoubleFromKeyboard();

        switch (operation) {
            case '+':
                 calculation.addition(a, b);
                break;
            case '-':
                calculation.subtraction(a, b);
                break;
            case '*':
                calculation.multiplication(a, b);
                break;
            case '/':
                calculation.division(a, b);
                break;
        }
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
}
