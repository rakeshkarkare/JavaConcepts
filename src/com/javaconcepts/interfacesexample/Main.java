package com.javaconcepts.interfacesexample;

public class Main {

    public static void main(String[] args) {

        TaxCalculator2018 calculator = new TaxCalculator2018(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);

//        report.setCalculator(new TaxCalculator2019());
        report.show(new TaxCalculator2019());
    }
}
