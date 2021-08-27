package com.javaconcepts.oopsconcepts;

public class Main {

    public static void main(String[] args) {

        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);

        TextBox textBox3 = new TextBox();
        TextBox textBox4 = textBox3;
        textBox4.setText("Hello Java");
//        System.out.println(textBox3.text);

    }
}
