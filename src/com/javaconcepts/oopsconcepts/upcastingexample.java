package com.javaconcepts.oopsconcepts;

import com.javaconcepts.oopsconcepts.inheritance.UIControl;

public class upcastingexample {

    public static void main(String[] args) {
        UIControl uiControl = new UIControl(true);
        TextBox textBox = new TextBox();
        show(uiControl);
    }

    public static void show(UIControl control){
        if (control instanceof TextBox){
            TextBox control1 = (TextBox) control;
            control1.setText("Hello Java");
        }
        System.out.println(control);
    }

}
