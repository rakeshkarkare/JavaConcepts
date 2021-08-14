package com.datastructures.queuesexamples;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);

        int front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue);

    }


}
