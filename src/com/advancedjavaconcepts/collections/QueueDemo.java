package com.advancedjavaconcepts.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show(){

        Queue<String> queue = new ArrayDeque<>();
        queue.add("java");
        queue.add("python");
        queue.add("golang");
        String front = queue.peek();
        System.out.println(front);
        System.out.println(queue);

    }

}
