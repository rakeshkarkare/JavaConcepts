package com.lamdaexpressions;

public class LamdasDemo {

    public static void show(){
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer){
        printer.print("Hello Python");
    }
}
