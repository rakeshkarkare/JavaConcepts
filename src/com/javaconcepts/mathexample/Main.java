package com.javaconcepts.mathexample;

public class Main {

    public static void main(String[] args) {
        int x = Math.round(1.2F);
        System.out.println(x);

        int x1 = (int)Math.ceil(1.2F);
        System.out.println(x1);

        int x2 = (int)Math.floor(1.2F);
        System.out.println(x2);

        int x3 = Math.max(1, 2);
        System.out.println(x3);

        int x4 = Math.min(1, 2);
        System.out.println(x4);

        int x5 = (int) Math.round(Math.random() * 100);
        System.out.println(x5);

    }
}
