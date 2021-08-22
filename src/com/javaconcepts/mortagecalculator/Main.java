package com.javaconcepts.mortagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Principal: " );
            principal  = scanner.nextInt();
            if (principal >=1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true){
            System.out.println("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >=1 && annualInterest <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        while(true){
            System.out.println("Period in (Years) : ");
            years = scanner.nextByte();
            if (years >=1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);

    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years){

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage= principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
