package com.datastructures.linkedlistExample;

import com.datastructures.arraysconcepts.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        linkedlist lst = new linkedlist();
        System.out.println(lst.size());
        lst.addLast(10);
        lst.addLast(20);
        lst.addLast(30);
        lst.addLast(40);
        lst.addLast(50);
        System.out.println(Arrays.toString(lst.toArray()));
        System.out.println(lst.size());
        System.out.println(lst.indexOf(50));
        System.out.println(lst.contains(4));
//        lst.removeFirst();
//        System.out.println(lst.size());
//        lst.removeLast();
//        System.out.println(lst.size());
//        lst.reverse();
//        System.out.println(Arrays.toString(lst.toArray()));
        System.out.println(lst.getKthFromTheEnd(2));



    }
}
