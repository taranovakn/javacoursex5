package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.NotEnoughMoneyException;
import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.io.IOException;

public interface AccountService {
    //вывод денег со счета
    void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException;
    //вывод баланса счета
    void balance(int id) throws UnknownAccountException, IOException;
    //внесение депозита на счет
    void deposit(int accountId, double amount) throws UnknownAccountException, IOException;
    //перечисление денег со счета на счет
    void transfer(int from, int to, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException;
}
