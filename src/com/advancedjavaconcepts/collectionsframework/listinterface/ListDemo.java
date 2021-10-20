package com.advancedjavaconcepts.collectionsframework.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Collections.addAll(list, "a", "b", "c");
        list.set(0, "a++");
        list.add(0, "!");
        System.out.println(list);
        System.out.println(list.indexOf("a"));
    }
}
