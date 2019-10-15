package com.test;

import com.data.structure.ArrayStack;

public class testArrayStack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        // System.out.println(stack.peek());
        stack.push(1);
        System.out.println(stack.peek());

        stack.push(2);
        stack.push(3);

        stack.push("abc");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}
