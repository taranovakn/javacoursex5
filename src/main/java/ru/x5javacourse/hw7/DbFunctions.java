package ru.x5javacourse.hw7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbFunctions implements StorageStrategy {

    private final Connection connection;
    private PreparedStatement statement = null;

    public DbFunctions() {
        Connection tryConnection;
        try {
            tryConnection = DriverManager.
                    getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'\\;" +
                            "RUNSCRIPT FROM './dataConstructor.sql'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            tryConnection = null;
        }
        connection = tryConnection;
    }

    @Override
    public void closeResources() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Account> readFromStorage() {
            List<Account> arrayList = new ArrayList<>();
            String sql = "Select * from Accounts;";
        try {
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int holderId = resultSet.getInt("holderId");
                double amount = resultSet.getDouble("amount");
                arrayList.add(new Account(id, holderId, amount));
            }
            statement.close();
            return arrayList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void startConstructor() {
    }

    @Override
    public void writerToStorage(Account account) {
            String sql = "Update Accounts SET amount = ?  where id = ? and holderId = ?;";
        try {
            statement = connection.prepareStatement(sql);
            statement.setDouble(1,account.getAmount());
            statement.setInt(2, account.getId());
            statement.setInt(3, account.getHolderId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
