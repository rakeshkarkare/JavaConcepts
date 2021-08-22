package com.javaconcepts.operatorsandloops;

import java.util.Scanner;

public class BreakStatementExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

    }
}
