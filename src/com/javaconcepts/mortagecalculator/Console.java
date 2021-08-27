package com.javaconcepts.mortagecalculator;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >=min && value <= max)
                break;
            System.out.print("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
