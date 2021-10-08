package com.javaconcepts.oopsconcepts.classesobjects;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Test1");
        System.out.println(textBox.text);

        var textBox1 = new TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Automation Testing");
        System.out.println(textBox1.text);
    }
}
