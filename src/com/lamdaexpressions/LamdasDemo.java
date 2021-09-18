package com.lamdaexpressions;

public class LamdasDemo {

    public static void show(){
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer){
        printer.print("Hello Python");
    }
}
