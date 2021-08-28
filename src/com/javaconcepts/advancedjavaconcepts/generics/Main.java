package com.javaconcepts.advancedjavaconcepts.generics;

public class Main {
    public static void main(String[] args) {

        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        int number = list.get(0);
        System.out.println(number);

    }
}
