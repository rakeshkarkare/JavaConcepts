package com.datastructures.arraysconcepts;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
