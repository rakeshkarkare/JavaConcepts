package com.javaconcepts.oopsconcepts.constructors;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(10_000);
        Employee employee = new Employee(
                50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }

}
