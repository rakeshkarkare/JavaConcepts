package com.javaconcepts.oopsconcepts.abstraction;

public class Employee {

    private int hourlyRate;
    private int baseSalary;

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or negative.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
