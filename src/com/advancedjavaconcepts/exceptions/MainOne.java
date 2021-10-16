package com.advancedjavaconcepts.exceptions;

import java.io.IOException;

public class MainOne {
    public static void show() throws IOException {

        NewSampleException sn = new NewSampleException();
        try {
            sn.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }
}
