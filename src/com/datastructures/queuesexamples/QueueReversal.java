package com.datastructures.queuesexamples;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        revers(queue);
        System.out.println(queue);
    }

    public static void revers(Queue<Integer> queue){

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.empty())
            queue.add(stack.pop());
    }

}
