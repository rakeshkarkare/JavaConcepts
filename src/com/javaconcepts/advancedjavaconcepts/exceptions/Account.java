package com.javaconcepts.advancedjavaconcepts.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException{
//        if (value <= 0)
//            throw new IllegalArgumentException();
        if (value <= 0)
              throw new IOException();
    }

    public void withdraw(float value) throws AccountException{
        if (value > balance)
            throw new AccountException(new InsuffientFundsException());
    }
}
