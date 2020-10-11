package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.NotEnoughMoneyException;
import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

public interface AccountService {
    //вывод денег со счета
    void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException;
    //вывод баланса счета
    void balance(int id) throws UnknownAccountException;
    //внесение депозита на счет
    void deposit(int accountId, double amount) throws UnknownAccountException;
    //перечисление денег со счета на счет
    void transfer(int from, int to, double amount) throws NotEnoughMoneyException, UnknownAccountException;
    //завершение работы системы, закрытие коннекшенов
    void closeConnections();
}
