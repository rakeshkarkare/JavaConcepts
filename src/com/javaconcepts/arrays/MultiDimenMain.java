package com.javaconcepts.arrays;

import java.util.Arrays;

public class MultiDimenMain {

    public static void main(String[] args) {

        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] numbersOne = { {1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbersOne));

    }
}
