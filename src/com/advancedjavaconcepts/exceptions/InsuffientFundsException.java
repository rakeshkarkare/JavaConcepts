package com.advancedjavaconcepts.exceptions;

//Checked -> Exception
//Unchecked (runtime) -> RuntimeException

public class InsuffientFundsException extends Exception{

    public InsuffientFundsException(){
        super("Insufficient Funds in your account");
    }

    public InsuffientFundsException(String message){
        super(message);
    }

}
