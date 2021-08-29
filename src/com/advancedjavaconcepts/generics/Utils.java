package com.advancedjavaconcepts.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return first.compareTo(second) < 0 ? second : first;
    }

    public static <K, V> void  print(K key, V value){
        System.out.println(key + "=" + value);
    }
}
