package com.advancedjavaconcepts.collectionsframework.mapinterface;

import com.advancedjavaconcepts.collections.Customer;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(),c2);

        var customer = map.get("e1");
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(customer);
        System.out.println(map);

        for (var entry: map.entrySet())
            System.out.println(entry.getKey());

    }
}
