package com.advancedjavaconcepts.exceptions;

import java.io.IOException;

public class NewSampleException {

    public void deposit(float value) throws IOException{
        if (value <= 0)
            throw new IOException();
    }
}
