package com.datastructures.stacksexample;

public class MainOne {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
