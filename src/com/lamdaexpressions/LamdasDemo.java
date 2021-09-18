package com.lamdaexpressions;

public class LamdasDemo {

    public static String prefix = "_";
    public static void show(){
        greet(message -> System.out.println(prefix + message));
        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer){
        printer.print("Hello Python");
    }
}
