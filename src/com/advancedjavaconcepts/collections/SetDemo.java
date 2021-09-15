package com.advancedjavaconcepts.collections;

import java.util.*;

public class SetDemo {

    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "a");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 =
                new HashSet<>(Arrays.asList("b", "c", "d"));

        //Union
        set1.addAll(set2);
        System.out.println(set1);

        //Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        //Difference
        set1.removeAll(set2);
        System.out.println(set1);

    }

}
