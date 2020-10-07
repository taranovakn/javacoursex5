package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.NotEnoughMoneyException;
import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.io.IOException;
import java.util.List;

import static ru.x5javacourse.hw7.FileFunctions.*;

public class UserFunctionsWithBankNumber implements AccountService {
    @Override
    public void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        Account account = getAccountByIdFromFile(accountId);

        if (account != null) {
            if (account.getAmount() >= amount){
                account.setAmount(account.getAmount() - amount);
                fileWriter(account);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownAccountException();
        }
    }

    @Override
    public void balance(int id) throws UnknownAccountException, IOException {
        List<Account> accountList = read();
        Account account = null;
        for (Account value : accountList) {
            if (value.getId() == id) {
                account = value;
                break;
            }
        }
        if (account != null) {
            System.out.println("Баланс счета " + id + " равен " +
                    account.getAmount() + " рублей.");
        } else {
            throw new UnknownAccountException();
        }
    }

    @Override
    public void deposit(int id, double addAmount) throws UnknownAccountException, IOException {
        List<Account> accountList = read();
        Account account = null;
        for (Account value : accountList) {
            if (value.getId() == id) {
                account = value;
                break;
            }
        }
        if (account != null) {
            double newAmount = account.getAmount() + addAmount;
            account.setAmount(newAmount);
            fileWriter(account);
            balance(id);
        } else {
            throw new UnknownAccountException();
        }
    }

    private Account getAccountByIdFromFile(int id) throws IOException {
        List<Account> accountList = read();
        Account account= null;
        for (Account value : accountList) {
            if (value.getId() == id) {
                account = value;
                break;
            }
        }
        return account;
    }
    @Override
    public void transfer(int from, int to, double amount) throws UnknownAccountException, IOException, NotEnoughMoneyException {

        Account accountFrom = getAccountByIdFromFile(from);
        Account accountTo = getAccountByIdFromFile(to);

        if (accountFrom != null && accountTo != null) {
            if (accountFrom.getAmount() >= amount){
                accountFrom.setAmount(accountFrom.getAmount() - amount);
                accountTo.setAmount(accountTo.getAmount() + amount);
                fileWriter(accountFrom);
                fileWriter(accountTo);
                System.out.println("Перевод исполнен");
                balance(from);
                balance(to);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownAccountException();
        }
    }
}