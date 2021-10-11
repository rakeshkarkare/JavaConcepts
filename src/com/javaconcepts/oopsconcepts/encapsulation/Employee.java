package com.javaconcepts.oopsconcepts.encapsulation;

public class Employee {

    private int hourlyRate;
    private int baseSalary;

    public int calculateWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or negative.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
