package com.javaconcepts.oopsconcepts.inheritance;

import com.javaconcepts.oopsconcepts.TextBox;

public class Main {

    public static void main(String[] args) {
        TextBox uiControl = new TextBox();
        uiControl.disable();
        System.out.println(uiControl.isEnabled());
    }
}
