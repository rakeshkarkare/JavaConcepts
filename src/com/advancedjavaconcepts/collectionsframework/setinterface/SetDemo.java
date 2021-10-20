package com.advancedjavaconcepts.collectionsframework.setinterface;

import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b","c","c");
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set1);

        Set<String> set2 = new HashSet<>(Arrays.asList("a","b","c"));

        Set<String> set3 = new HashSet<>(Arrays.asList("b","c","d"));

//        // Union
//        set2.addAll(set3);
//        System.out.println(set2);

//        // Intersection
//        set2.retainAll(set3);
//        System.out.println(set2);

        // Difference
        set2.removeAll(set3);
        System.out.println(set2);
    }
}
