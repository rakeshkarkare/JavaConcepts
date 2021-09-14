package com.advancedjavaconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "java", "python", "javascript");
        list.indexOf("java");
        list.lastIndexOf("java");
        System.out.println(list);
        System.out.println(list.subList(0, 2));

    }
}
