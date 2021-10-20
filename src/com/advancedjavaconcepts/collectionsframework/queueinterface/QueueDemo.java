package com.advancedjavaconcepts.collectionsframework.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        //d -> b -> a -> c
        System.out.println(queue);
        var front = queue.peek();
        System.out.println(front);

    }
}
