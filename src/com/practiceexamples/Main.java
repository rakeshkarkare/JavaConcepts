package com.practiceexamples;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String str = "Selenium";
        HashMap<Integer, Character> hashMap = new HashMap<>();

        for(int i=0; i < str.length(); i++ )
            hashMap.put(i, str.charAt(i));
        System.out.println(hashMap);
    }
}
