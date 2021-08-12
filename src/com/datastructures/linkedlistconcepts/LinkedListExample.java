package com.datastructures.linkedlistconcepts;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        System.out.println(list);
        System.out.println(list.size());
        list.toArray();
        System.out.println(Arrays.toString(list.toArray()));


    }
}
