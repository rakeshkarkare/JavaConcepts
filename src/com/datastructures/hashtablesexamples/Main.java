package com.datastructures.hashtablesexamples;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Mosh");
        hmap.put(2, "Josh");
        hmap.put(3, "Karkare");
        hmap.put(3, "Rakesh");
        hmap.put(4, null);
        hmap.put(null, null);
        System.out.println(hmap);
    }


}
