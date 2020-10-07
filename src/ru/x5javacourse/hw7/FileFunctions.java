package ru.x5javacourse.hw7;

import ru.x5javacourse.hw7.Exceptions.UnknownAccountException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileFunctions {
    public static final String FILE_NAME = "bankDB.txt";

    public static void fileWriter(Account account) throws IOException, UnknownAccountException {

        String oldString = getLineByIdAndHolderId(account);
        String newString = stringNewAccount(account);

        if (oldString != null) {
            File fileToBeModified = new File(FILE_NAME);
            StringBuilder oldContent = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));
                String line = reader.readLine();
                while (line != null) {
                    oldContent.append(line).append(System.lineSeparator());
                    line = reader.readLine();
                }
                String newContent = oldContent.toString().replace(oldString, newString);
                FileWriter writer = new FileWriter(fileToBeModified);
                writer.write(newContent);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new UnknownAccountException();
        }
    }

    //возвращает найденную строку по сочетанию id и holderId
    public static String getLineByIdAndHolderId(Account account) throws IOException {
        List<Account> accountFromFile = read();
        for (Account value : accountFromFile) {
            if (account.getId() == value.getId() &&
                    account.getHolderId() == value.getHolderId()) {
                return stringNewAccount(value);
            }
        }
        return null;
    }

    public static boolean fileCreator() {
        File newFile = new File(FILE_NAME);
        try {
            return newFile.createNewFile();
        } catch (IOException e){
            System.out.println("Произошла ошибка при создании нового файла.");
            return false;
        }
    }

    public static String stringNewAccount(Account account){
        return account.getId() + "|" +
                        account.getHolderId() + "|" +
                        account.getAmount();
    }

    public static void startConstructor() {
        fileCreator();
        ArrayList<String> newAccount = new ArrayList<>();
        newAccount.add(stringNewAccount(new Account(1, 2, 555.0)));
        newAccount.add(stringNewAccount(new Account(2, 1, 1000)));
        newAccount.add(stringNewAccount(new Account(3, 3, 1122)));
        newAccount.add(stringNewAccount(new Account(4, 4, 890)));
        newAccount.add(stringNewAccount(new Account(5, 5, 650)));
        newAccount.add(stringNewAccount(new Account(6, 7, 1)));
        newAccount.add(stringNewAccount(new Account(7, 6, 0)));
        newAccount.add(stringNewAccount(new Account(8, 8, 7642)));
        newAccount.add(stringNewAccount(new Account(9, 10, 435)));
        newAccount.add(stringNewAccount(new Account(10, 9, 860)));

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (String s : newAccount) {
                writer.append(s).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }

    }

    public static List<Account> read() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
        List<Account> arrayList = new ArrayList<>();
        for(Object s : lines)
        {
            String str = s.toString();
            String[] arr = str.split("\\|");
            int id = Integer.parseInt(arr[0]);
            int holderID = Integer.parseInt(arr[1]);
            double amount = Double.parseDouble(arr[2]);
            arrayList.add(new Account(id, holderID, amount));
        }
        return arrayList;
    }
}
