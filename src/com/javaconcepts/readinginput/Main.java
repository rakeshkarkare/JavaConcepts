package com.javaconcepts.readinginput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Age: ");
        byte age= scanner.nextByte();

        System.out.println("You are " + age);

        Scanner scanner1= new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner1.nextLine().trim();

        System.out.println("Your name is " + name);
    }
}
