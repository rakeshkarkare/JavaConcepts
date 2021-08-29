package com.advancedjavaconcepts.exceptions;

public class AccountException extends Exception{

    public AccountException(Exception clause){
        super(clause);
    }
}
