package com.advancedjavaconcepts.lambdaexpressions.functionalinterface;

public class LamdasDemo {

    public static void print(String message) {}

    public static void show(){
        greet(message -> print(message));
        greet(LamdasDemo::print);
        //Class /Object::method
    }

    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
