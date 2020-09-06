package ru.x5javacourse.hw2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW2 {
    public static <string> void hw2_choosing() throws IOException {

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
        Integer number_of_calculation = readIntFromKeyboard();

        switch (number_of_calculation) {
            case 1: // 1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.
                theLastSymbolOfNumber();
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
                compare3SymbolsNumbers();
                break;
            case 6: // 6. Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число»,
                // «нулевое число»,  «положительное нечетное число» и т. д.
                descriptionOfNumber();
                break;
            case 7:
                // 7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора
                // в зависимости от кода города.
                CallPrice();
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
                int[] numArrayForCase10 = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
                moveZeroToTheEndOfArray(numArrayForCase10);
                break;

        }
        //else System.out.println("К сожалению вы ввели некорректный номер, перезапустите приложение и выберите снова.
        // Пока только так:( Но я учусь:) ");
    }
    public static void descriptionOfNumber() throws IOException {
        System.out.println("Введите целое число");
        Integer number_for_case6 = readIntFromKeyboard();
        boolean positive_flag = positive_number(number_for_case6);
        boolean odd_flag = odd_number(number_for_case6); // нечетное
        if (number_for_case6 == 0) {
            System.out.println(number_for_case6 + " - нулевое число");
        } else if (odd_flag) {
            if (positive_flag) {
                System.out.println(number_for_case6 + " - это нечетное положительное число");
            } else System.out.println(number_for_case6 + " - это нечетное отрицательное  число");
        } else if (positive_flag) {
            System.out.println(number_for_case6 + " - это четное положительное число");
        } else System.out.println(number_for_case6 + " - это четное отрицательное  число");
    }
    public static void compare3SymbolsNumbers() throws IOException {
        int[] numbers;
        numbers = new int[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите " + i + "-е целое число");
            numbers[i - 1] = readIntFromKeyboard();
        }
        int biggest_number = maximumNumber(numbers);
        System.out.println("Наибольшее число " + biggest_number);
    }
    public static void sumOfNumbersWithCalculationCase4 () throws IOException {
        System.out.println("Введите число (Возможен ввод положительных и отрицательных чисел)");
        int number_for_case4 = readIntFromKeyboard();
        if (number_for_case4 > 0) {
            number_for_case4++;
        } else
            if (number_for_case4 < 0) {
            number_for_case4 += 2;
            } else
                if (number_for_case4 == 0) {
                    number_for_case4 = 10;
                }
        System.out.println("Итоговое число: " + number_for_case4);
    }
    public static void sumOfNumbersWithCalculation() throws IOException {
        System.out.println("Введите число (Возможен ввод положительных и отрицательных чисел)");
        Integer number_for_case3 = readIntFromKeyboard();
        if (number_for_case3 > 0) {
            number_for_case3++;
        }
        System.out.println("Итоговое число: " + number_for_case3);
    }
    public static void sumOfNumbers() throws IOException {
        System.out.println("Введите трехзначное число");
        int number_for_sum = readIntFromKeyboard();
        int sum = number_for_sum / 100 + number_for_sum / 10 % 10 + number_for_sum % 10;
        System.out.println("Сумма цифр трехначного числа " + sum);
    }
    public static void theLastSymbolOfNumber() throws IOException {
        System.out.println("Введите число");
        int number_for_the_last_symbol = readIntFromKeyboard();
        number_for_the_last_symbol = number_for_the_last_symbol % 10;
        System.out.println("Последняя цифра введенного числа " + number_for_the_last_symbol);
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

            if (negative_number(numArray[i]) && even_number(numArray[i])) {
                sumOfOddNegativeNumbers = sumOfOddNegativeNumbers + numArray[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов в массиве " + sumOfOddNegativeNumbers);
    }

    public static void countOfPositiveNumbers(int[] numArray){
        int countOfPositiveNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (positive_number(numArray[i]) )
                countOfPositiveNumbers ++;
        }
        System.out.println("Количество положительных элементов в массиве (не включая 0) " + countOfPositiveNumbers);
    }

    public static void averageOfNegativeNumbers(int[] numArray){
        double counterOfNegativeNumbers;
        counterOfNegativeNumbers = 0;
        double sumOfNegativeNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (negative_number(numArray[i])) {
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
            else;
        }
        return maxNumber;
    }

    public static void CallPrice() throws IOException {
        System.out.println("Введите код города: Москва(905), Ростов(194), Краснодар(491), Киров(800)");
        Integer codeForCase7 = readIntFromKeyboard();
        System.out.println("Сколько минут планируется звонок?");
        Integer minForCall = readIntFromKeyboard();
        double finalCallPrice = 0;
        if (codeForCase7 == 905) {
            finalCallPrice = minForCall * 4.15;
            System.out.println("Москва. Стоимость разговора за "+minForCall + " минут:" + finalCallPrice +"руб");
        } else
            if (codeForCase7 == 194) {
                finalCallPrice = minForCall * 1.98;
                System.out.println("Ростов. Стоимость разговора за "+minForCall + " минут:" + finalCallPrice +"руб");
        } else
            if (codeForCase7 == 491) {
                finalCallPrice = minForCall * 2.69;
                System.out.println("Краснодар. Стоимость разговора за "+minForCall + " минут:" + finalCallPrice +"руб");
            } else
            if (codeForCase7 == 800) {
                finalCallPrice = minForCall * 5;
                System.out.println("Киров. Стоимость разговора за "+minForCall + "минут:" + finalCallPrice +"руб");
            } else System.out.println("Вы ввели некорректный код города, перезапустите программу и попробуйте еще раз");
    }
    public static String reader_from_keyboard() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entered_value = reader.readLine();
        return entered_value;
    }
    public static Integer readIntFromKeyboard() throws IOException {
        boolean isNotCorrectInput = true;
        while (isNotCorrectInput) {
            try {
                return Integer.valueOf(reader_from_keyboard());
            } catch (NumberFormatException exception) {
                System.out.println("Вы ввели не число");
            }
        }
        return 0;
    }
    public static boolean positive_number( int num) {
        boolean is_positive = false; // положительное
        if (num > 0) {
            is_positive = true;
    }
        return is_positive;
    }

    public static boolean negative_number( int num) {
        boolean is_negative = false; // отрицательное
        if (num < 0) {
            is_negative = true;
        }
        return is_negative;
    }
    public static boolean odd_number( int num){ // нечетное
        boolean is_odd = false; // нечетное
        if (num%2==1) {
            is_odd = true;
        }
        return is_odd;
    }
    public static boolean even_number( int num) {// четное
        boolean is_even = false; // нечетное
        if (num%2==0) {
            is_even = true;
        }
        return is_even;
    }

    }
