package com.advancedjavaconcepts.collections;

import com.advancedjavaconcepts.generics.GenericList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object current = iterator.next();
            System.out.println(current);
        }
    }
}
