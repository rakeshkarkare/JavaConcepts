package com.datastructures.linkedlistconcepts;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        BuildingLinkedListExample list = new BuildingLinkedListExample();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(40);
        list.removeFirst();
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(50));
        System.out.println(list.contains(40));


    }
}
