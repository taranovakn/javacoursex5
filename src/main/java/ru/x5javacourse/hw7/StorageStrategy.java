package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.util.List;

public interface StorageStrategy {

    List<Account> readFromStorage();

    void startConstructor();

    void writerToStorage(Account account) throws UnknownAccountException;

    void closeResources();

}
