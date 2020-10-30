package ru.x5javacourse.hw5.Calculator;

import ru.x5javacourse.hw5.Calculator.Log.Logger;

public class Calculation {
    Logger logger;

    public Calculation(Logger logger) {
        this.logger = logger;
    }

    public void addition (double a, double b){
        double result = a + b;
        logger.log("Выполнена операция сложения " + a + " и " + b + "; Результат: " + result);
    }

    public void division (double a, double b){
        double result = a / b;
        logger.log("Выполнена операция деления " + a + " и " + b + "; Результат: " + result);
    }

    public void subtraction(double a, double b){
        double result = a - b;
        logger.log("Выполнена операция вычитания " + a + " на " + b + "; Результат: " + result);
    }

    public void multiplication(double a, double b){
        double result = a * b;
        logger.log("Выполнена операция умножения " + a + " на " + b + "; Результат: " + result);
    }
}
