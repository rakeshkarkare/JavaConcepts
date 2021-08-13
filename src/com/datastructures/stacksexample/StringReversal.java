package com.datastructures.stacksexample;

import java.util.Stack;

public class StringReversal {

    public String reverse(String input){

        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char ch: input.toCharArray())
            stack.push(ch);

        StringBuffer reversal = new StringBuffer();

        while(!stack.empty())
            reversal.append(stack.pop());

        return reversal.toString();

    }
}
