package com.advancedjavaconcepts.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() throws IOException {
        try (FileReader reader = new FileReader("file.txt")) {
            int value = reader.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read data.");
        }

        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
             Throwable clause = e.getCause();
            System.out.println(clause.getMessage());
        }
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//            throw e;
//        }

    }

}
