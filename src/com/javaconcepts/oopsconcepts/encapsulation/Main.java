package com.javaconcepts.oopsconcepts.encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
