package com.javaconcepts.interfacesexample;

public class TaxReport {

    private TaxCalculator calculator;

//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator){
        Double tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
