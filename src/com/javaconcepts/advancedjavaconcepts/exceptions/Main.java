package com.javaconcepts.advancedjavaconcepts.exceptions;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

        ExceptionDemo exceptionDemo = new ExceptionDemo();
        try {
            ExceptionDemo.show();
        } catch (Throwable e) {
            System.out.println("An Unexpected Error message occured.");
        }

    }
}
