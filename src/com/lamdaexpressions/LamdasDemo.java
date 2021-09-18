package com.lamdaexpressions;

public class LamdasDemo {

    public static void show(){
        greet(message -> System.out.println(message));

        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer){
        printer.print("Hello Python");
    }
}
