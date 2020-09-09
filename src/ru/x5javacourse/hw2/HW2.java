package ru.x5javacourse.hw2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW2 {
    public static <string> void hw2Choosing() throws IOException {

        System.out.println("Выберите какое из вычиcлений вы хотите проверить");
        System.out.println("1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.");
        System.out.println("2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.");
        System.out.println("3. Ввести целое число в консоли.  Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.");
        System.out.println("4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.");
        System.out.println("5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.");
        System.out.println("6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число»,  «положительное нечетное число» и т. д.");
        System.out.println("7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.");
        System.out.println("8. Для массива найти и вывести на экран: максимальное значение; сумму положительных элементов; сумму четных отрицательных элементов; количество положительных элементов; среднее арифметическое отрицательных элементов.");
        System.out.println("9. Переставить элементы массива в обратном порядке. Вывести результат в консоль.");
        System.out.println("10. Переместить нули в конец массива. Вывести результат в консоль. ");
        Integer numberOfCalculation = readIntFromKeyboard();

        switch (numberOfCalculation) {
            case 1: // 1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
                calculateTheLastSymbolOfNumber();
                break;
            case 2: // 2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.
                sumOfNumbers();
                break;
            case 3:
                // 3. Ввести целое число в консоли.
                // Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его.
                // Вывести полученное число.
                sumOfNumbersWithCalculation();
                break;
            case 4:
                // 4. Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1;
                // если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10.
                // Вывести полученное число.
                sumOfNumbersWithCalculationCase4();
                break;
            case 5: // 5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.
                compareNumbers();
                break;
            case 6: // 6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
                // «нулевое число»,  «положительное нечетное число» и т. д.
                descriptionOfNumber();
                break;
            case 7:
                // 7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора
                // в зависимости от кода города.
                callPrice();
                break;
            case 8:
                // 8. Для массива найти и вывести на экран: максимальное значение; сумму положительных элементов;
                // сумму четных отрицательных элементов; количество положительных элементов;
                // среднее арифметическое отрицательных элементов.
                int[] numArrayForCase8 = {1, 10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
                maxValueOfArray(numArrayForCase8);
                sumOfPositiveElements(numArrayForCase8);
                sumOfOddNegativeNumbers(numArrayForCase8);
                countOfPositiveNumbers(numArrayForCase8);
                averageOfNegativeNumbers(numArrayForCase8);
                break;
            case 9: // 9. Переставить элементы массива в обратном порядке. Вывести результат в консоль.
                int[] numArrayForCase9 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
                revertOfArray(numArrayForCase9);
                break;
            case 10: // 10. Переместить нули в конец массива. Вывести результат в консоль.
                int[] numArrayForCase10 = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
                moveZeroToTheEndOfArray(numArrayForCase10);
                break;

        }
        //else System.out.println("К сожалению вы ввели некорректный номер, перезапустите приложение и выберите снова.
        // Пока только так:( Но я учусь:) ");
    }

    public static void descriptionOfNumber() throws IOException {
        System.out.println("Введите целое число");
        Integer number = readIntFromKeyboard();
        String positiveOrNegativeDefinition = positiveOrNegativeNumberStringDescription(number);
        String oddOrEvenDefinition = evenOrOddNumberStringDescription(number);

       if (number == 0) {
           System.out.println(number + " - нулевое число");
        } else System.out.println(number + " - это " +positiveOrNegativeDefinition + oddOrEvenDefinition+ "число");
    }

    public static void compareNumbers() throws IOException {

        int[] numbers;
        int countOfNumbersToCompare = correctCountInput();

        numbers = new int[countOfNumbersToCompare];
        for (int i = 1; i <= countOfNumbersToCompare; i++) {
            System.out.println("Введите " + i + "-е целое число");
            numbers[i - 1] = readIntFromKeyboard();
        }
        int biggestNumber;
        biggestNumber = maximumNumber(numbers);
        System.out.println("Наибольшее число " + biggestNumber);
    }
    public static int correctCountInput() throws IOException {
        System.out.println("Введите количество числе для сравнения.");
        boolean isNotCorrectInput = true;
        while (isNotCorrectInput) {
        int countOfComparableNumbers = readIntFromKeyboard();
        if (countOfComparableNumbers >0){
            return countOfComparableNumbers;
        } else System.out.println("Вы ввели некорректное количество.");
    }
        return 0;
    }
    public static void sumOfNumbersWithCalculationCase4 () throws IOException {
        System.out.println("Введите число (Возможен ввод положительных и отрицательных чисел)");
        int number = readIntFromKeyboard();
        if (number > 0) {
            number++;
        } else
            if (number < 0) {
                number += 2;
            } else number = 10;

        System.out.println("Итоговое число: " + number);
    }
    public static void sumOfNumbersWithCalculation() throws IOException {
        System.out.println("Введите число (Возможен ввод положительных и отрицательных чисел)");
        Integer sumOfNumbersWithCalculation = readIntFromKeyboard();
        if (sumOfNumbersWithCalculation > 0) {
            sumOfNumbersWithCalculation++;
        }
        System.out.println("Итоговое число: " + sumOfNumbersWithCalculation);
    }
    public static void sumOfNumbers() throws IOException {
        System.out.println("Введите трехзначное число");
        int numberForSum = readIntFromKeyboard();
        int sumOfNumbers = numberForSum / 100 + numberForSum / 10 % 10 + numberForSum % 10;
        System.out.println("Сумма цифр трехначного числа " + sumOfNumbers);
    }
    public static void calculateTheLastSymbolOfNumber() throws IOException {
        System.out.println("Введите число");
        int calculateTheLastSymbolOfNumber = readIntFromKeyboard();
        calculateTheLastSymbolOfNumber = calculateTheLastSymbolOfNumber % 10;
        System.out.println("Последняя цифра введенного числа " + calculateTheLastSymbolOfNumber);
    }
    public static void revertOfArray(int[] numArray){

        int[] revertedNumArrayForCase9 = new int[numArray.length];
        int indexOfRevertArray=0;
        for (int i = numArray.length-1; i >=0; i--) {
            revertedNumArrayForCase9[indexOfRevertArray]= numArray[i];
            indexOfRevertArray++;
        }
        System.out.print ("Массив в обратной последовательности чисел: ");
        for (int i = 0; i < revertedNumArrayForCase9.length; i++) {
            System.out.print(revertedNumArrayForCase9[i]+"; ");
        }
    }
    public static void moveZeroToTheEndOfArray(int[] numArray) {
        int[] moveZeroToTheEnd = new int[numArray.length];
        int moveZeroToTheEndIndex=0;
        for (int i = 0; i < numArray.length-1; i++) {
            if (numArray[i] != 0) {
                moveZeroToTheEnd[moveZeroToTheEndIndex] = numArray[i];
                moveZeroToTheEndIndex++;
            }
        }
        System.out.print("Массив с перемещенными нулями в конец ");
        for (int i = 0; i < moveZeroToTheEnd.length; i++) {
            System.out.print(moveZeroToTheEnd[i]+"; ");
        }
    }
    public static void maxValueOfArray(int[] numArray) {

        int maxNumber = maximumNumber(numArray);
        System.out.println("Максимальное число в массиве " + maxNumber);
    }
    public static void sumOfPositiveElements(int[] numArray) {
        int sumOfPositiveElements = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0)
                sumOfPositiveElements = sumOfPositiveElements + numArray[i];
        }
        System.out.println("Сумма положительных элементов в массиве " + sumOfPositiveElements);
    }
    public static void sumOfOddNegativeNumbers(int[] numArray) {
        int sumOfOddNegativeNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (negativeNumber(numArray[i]) && isEvenNumber(numArray[i])) {
                sumOfOddNegativeNumbers = sumOfOddNegativeNumbers + numArray[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов в массиве " + sumOfOddNegativeNumbers);
    }
    public static void countOfPositiveNumbers(int[] numArray){
        int countOfPositiveNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (positiveNumber(numArray[i]) )
                countOfPositiveNumbers ++;
        }
        System.out.println("Количество положительных элементов в массиве (не включая 0) " + countOfPositiveNumbers);
    }
    public static void averageOfNegativeNumbers(int[] numArray){
        double counterOfNegativeNumbers;
        counterOfNegativeNumbers = 0;
        double sumOfNegativeNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (negativeNumber(numArray[i])) {
                sumOfNegativeNumbers = sumOfNegativeNumbers + numArray[i];
                counterOfNegativeNumbers++;
            }
        }
        double averageOfNegativeNumbers = sumOfNegativeNumbers / counterOfNegativeNumbers;
        System.out.println("Среднее арифметическое отрицательных чисел в массиве: " + averageOfNegativeNumbers);
    }
    public static Integer maximumNumber (int[] arrayOfNumbers)  {
        int maxNumber = arrayOfNumbers[0];
        for (int n = 0; n < arrayOfNumbers.length; n++) {
            if  (maxNumber <= arrayOfNumbers[n]) {
                maxNumber = arrayOfNumbers[n];
            }
        }
        return maxNumber;
    }
    public static void callPrice() throws IOException {

        System.out.println("Введите код города: Москва(905), Ростов(194), Краснодар(491), Киров(800)");
        int codeOfCity = readIntFromKeyboard();
        System.out.println("Сколько минут планируется звонок?");
        int minForCall = readIntFromKeyboard();
        System.out.println(cityNames(codeOfCity) + "Стоимость разговора за "+minForCall + " минут:"
                + priceForCall(codeOfCity,minForCall) +"руб");
    }
    public static String cityNames(int codeOfCity){
        String cityNames;
        switch (codeOfCity){
            case 905: 
                cityNames = "Москва(905) ";
                break;
            case 194: 
                cityNames = "Ростов (194) ";
                break;
            case 491:
                cityNames = "Краснодар (491) ";
                break;
            case 800:
                cityNames = "Киров (800) ";
                break;
            default:
                throw new IllegalStateException("Упс:( Мы не знаем города с кодом: " + codeOfCity);
        }
        return cityNames;
    }
    public static Double priceForCall(int codeOfCity, int minForCall){

        double finalCallPrice = 0;
        if (codeOfCity == 905) {
            finalCallPrice = minForCall * 4.15;
        } else
        if (codeOfCity == 194) {
            finalCallPrice = minForCall * 1.98;
        } else
        if (codeOfCity == 491) {
            finalCallPrice = minForCall * 2.69;
        } else
        if (codeOfCity == 800) {
            finalCallPrice = minForCall * 5;
        } else System.out.println("Вы ввели некорректный код города, перезапустите программу и попробуйте еще раз");
        return (double) Math.round(finalCallPrice * 100) / 100;
    }
    public static String readerFromKeyboard() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enteredValue = reader.readLine();
        return enteredValue;
    }
    public static Integer readIntFromKeyboard() throws IOException {
        boolean isNotCorrectInput = true;
        while (isNotCorrectInput) {
            try {
                return Integer.valueOf(readerFromKeyboard());
            } catch (NumberFormatException exception) {
                System.out.println("Вы ввели не число");
            }
        }
        return 0;
    }
    public static boolean positiveNumber(int num) {
        boolean isPositive = false; // положительное
        if (num > 0) {
            isPositive = true;
    }
        return isPositive;
    }
    public static String positiveOrNegativeNumberStringDescription(int num) {
        String positiveNumberStringDescription;
        if (positiveNumber(num)){
            positiveNumberStringDescription = "положительное ";
        } else positiveNumberStringDescription = "отрицательное ";
        return positiveNumberStringDescription;
    }
    public static boolean negativeNumber(int num) {
        boolean isNegative = false; // отрицательное
        if (num < 0) {
            isNegative = true;
        }
        return isNegative;
    }

    public static boolean isEvenNumber(int num) {// четное
        boolean isEven = false; // нечетное
        if (num%2==0) {
            isEven = true;
        }
        return isEven;
    }
//    public static boolean isOddNumber(int num) {// нечетное
//        boolean isOdd = false; // четное
//        if (num%2==0) {
//            isOdd = true;
//        }
//        return isOdd;
//    }
    public static String evenOrOddNumberStringDescription(int num) {// четное
        String evenOrOddNumberStringDescription;
        if (isEvenNumber(num)){
            evenOrOddNumberStringDescription = "четное ";
        } else evenOrOddNumberStringDescription = "нечетное ";
        return evenOrOddNumberStringDescription;
    }
    }
