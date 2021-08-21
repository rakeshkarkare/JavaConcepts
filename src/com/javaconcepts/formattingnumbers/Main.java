package com.javaconcepts.formattingnumbers;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1123445.555);
        System.out.println(result);

        String result1 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result1);

    }
}
