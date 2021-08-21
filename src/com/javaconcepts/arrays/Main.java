package com.javaconcepts.arrays;

import java.util.Arrays;

public class Main {

    //Arrays are used to store list of items or list of numbers..

    public static void main(String[] args) {

        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        int [] numbersOne = {2, 3, 5, 1, 4};

        System.out.println(numbersOne.length);
        Arrays.sort(numbersOne);
        System.out.println(Arrays.toString(numbersOne));
    }
}
