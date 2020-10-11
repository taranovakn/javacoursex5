package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.NotEnoughMoneyException;
import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.io.IOException;

import static ru.x5javacourse.Main.continueProgram;
import static ru.x5javacourse.hw2.HW2.readerFromKeyboard;

public class HW7 {

    public static void hw7() throws IOException {
        boolean continueAnswer = true;
        AccountService accountService = userStrategy();
        while (continueAnswer){
            try{
                System.out.println("Выберите команду, которую хотите выполнить: ");
                System.out.println("Узнать баланс: введите balance [id] счета \n" +
                        "Внести депозит на счет: введите deposit [id счета] [сумму для пополнения] \n" +
                        "Снятие денежных средств со счета: Введите withdraw [id счета] [сумму для сняти] \n" +
                        "Перевод денежных средств между счетами: Введите " +
                        "transfer [id счета для снятия] [id счета для зачисления] [сумму для перевода] \n");
                String userDo = readerFromKeyboard();
                String[] userDoArr = userDo.split(" ");

                switch (userDoArr[0]){
                    case "balance":
                        accountService.balance(Integer.parseInt(userDoArr[1]));
                        break;
                    case "deposit":
                        accountService.deposit(Integer.parseInt(userDoArr[1]),Double.parseDouble(userDoArr[2]));
                        break;
                    case "withdraw":
                        accountService.withdraw(Integer.parseInt(userDoArr[1]),Double.parseDouble(userDoArr[2]));
                        break;
                    case "transfer":
                        accountService.transfer(Integer.parseInt(userDoArr[1]),Integer.parseInt(userDoArr[2]), Double.parseDouble(userDoArr[3]));
                        break;
                    default:
                        System.out.println("Некорректный вид действия: " + userDoArr[0]);
                }
                continueAnswer = continueProgram();
                if (!continueAnswer){
                    accountService.closeConnections();
                }
            } catch (NotEnoughMoneyException n) {
                System.out.println("Недостаточно средств на счете.");
            } catch (UnknownAccountException u){
                System.out.println("Пользователь не найден, попробуйте еще раз.");
            }
        }
    }

    public static AccountService userStrategy() throws IOException {
        System.out.println("Выберите тип хранилища: file - файл, db - база данных H2.");
        String userStorage= readerFromKeyboard();
        AccountService accountService;
        if ("file".equals(userStorage)){
            new FileFunctions().startConstructor();
            accountService = new UserFunctionsWithBankNumber(new FileFunctions());
            return accountService;
        } else if ("db".equals(userStorage)){
            new DbFunctions().startConstructor();
            return new UserFunctionsWithBankNumber(new DbFunctions());
        } else {
            System.out.println("Выбран неверный тип хранилища данных. Повторите попытку еще раз.");
            return userStrategy();
        }
    }
}