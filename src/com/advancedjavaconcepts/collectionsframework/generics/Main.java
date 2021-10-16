package com.advancedjavaconcepts.collectionsframework.generics;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("Java");
        list.add("Python");
        for (var item:list)
            System.out.println(item);
    }
}
