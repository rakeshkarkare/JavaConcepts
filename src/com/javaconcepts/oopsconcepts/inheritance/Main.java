package com.javaconcepts.oopsconcepts.inheritance;

import com.javaconcepts.oopsconcepts.TextBox;

public class Main {

    public static void main(String[] args) {
        TextBox uiControl = new TextBox();
        uiControl.setText("Hello Java");
        System.out.println(uiControl);
        uiControl.disable();
        System.out.println(uiControl.isEnabled());
    }
}
