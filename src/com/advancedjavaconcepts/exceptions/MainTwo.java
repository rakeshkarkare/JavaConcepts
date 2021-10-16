package com.advancedjavaconcepts.exceptions;

import java.io.IOException;

public class MainTwo {
    public static void main(String[] args) {
        try {
            MainOne.show();
        } catch (Throwable e) {
            System.out.println("An Unexpected error occured.");
        }
    }
}
