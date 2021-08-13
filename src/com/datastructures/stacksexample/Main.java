package com.datastructures.stacksexample;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        int top =  stack.pop();
        System.out.println(top);
        System.out.println(stack);
        int top1 = stack.peek();
        System.out.println(top1);
        System.out.println(stack);
    }



}
