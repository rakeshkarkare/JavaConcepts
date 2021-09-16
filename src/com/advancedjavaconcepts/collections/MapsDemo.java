package com.advancedjavaconcepts.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo {

    public static void show(){
        Customer c1 = new Customer("a", "e1");
        Customer c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        Customer unknown = new Customer("Unknown", "");

        Boolean exists = map.containsKey("e1");
        System.out.println(exists);

        for(Map.Entry str : map.entrySet()){
            System.out.println(str.getKey());
        }

    }
}
