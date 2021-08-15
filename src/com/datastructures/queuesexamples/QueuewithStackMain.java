package com.datastructures.queuesexamples;

public class QueuewithStackMain {
    public static void main(String[] args) {
        QueueWithTwoStack queue = new QueueWithTwoStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        int first = queue.dequeue();
        System.out.println(first);
    }


}
