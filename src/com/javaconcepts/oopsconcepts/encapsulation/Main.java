package com.javaconcepts.oopsconcepts.encapsulation;


public class Main {
    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        test(employee);
    }

    public static void test(Employee employee){
        if (employee instanceof Employee)
            System.out.println("Yes, it is an instance of class Employee");
    }

}
