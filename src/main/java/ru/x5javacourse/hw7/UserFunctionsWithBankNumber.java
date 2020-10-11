package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.NotEnoughMoneyException;
import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.util.List;

public class UserFunctionsWithBankNumber implements AccountService {
    private final StorageStrategy strategy;

    public UserFunctionsWithBankNumber(StorageStrategy strategy) {
        this.strategy = strategy;
        strategy.startConstructor();
    }

    @Override
    public void closeConnections() {
        strategy.closeResources();
    }

    @Override
    public void withdraw(int accountId, double amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = getAccountByIdFromFile(accountId);

        if (account != null) {
            if (account.getAmount() >= amount){
                account.setAmount(account.getAmount() - amount);
                strategy.writerToStorage(account);
                balance(accountId);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownAccountException();
        }
    }

    @Override
    public void balance(int id) throws UnknownAccountException {
        List<Account> accountList = strategy.readFromStorage();
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
    public void deposit(int id, double addAmount) throws UnknownAccountException {
        List<Account> accountList = strategy.readFromStorage();
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
            strategy.writerToStorage(account);
            balance(id);
        } else {
            throw new UnknownAccountException();
        }
    }

    private Account getAccountByIdFromFile(int id){
        List<Account> accountList = strategy.readFromStorage();
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
    public void transfer(int from, int to, double amount) throws UnknownAccountException, NotEnoughMoneyException {

        Account accountFrom = getAccountByIdFromFile(from);
        Account accountTo = getAccountByIdFromFile(to);

        if (accountFrom != null && accountTo != null) {
            if (accountFrom.getAmount() >= amount){
                accountFrom.setAmount(accountFrom.getAmount() - amount);
                accountTo.setAmount(accountTo.getAmount() + amount);
                strategy.writerToStorage(accountFrom);
                strategy.writerToStorage(accountTo);
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