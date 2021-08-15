package com.datastructures.queuesexamples;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(60);
        System.out.println(queue);

        int front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue);

        queue.enqueue(70);
        System.out.println(queue);
        queue.enqueue(80);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(100);
        System.out.println(queue);

    }


}
