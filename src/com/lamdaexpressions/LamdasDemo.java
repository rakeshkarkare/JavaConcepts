package com.lamdaexpressions;

public class LamdasDemo {

    public static void print(String message){
    }

    public static String prefix = "_";
    public static void show(){
        greet(message -> print(message));
        greet(LamdasDemo::print);
        // Class/Object ::method
    }

    public static void greet(Printer printer){
        printer.print("Hell" +
                "o Python");
    }
}
