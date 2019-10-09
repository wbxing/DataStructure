package com.test;

import com.data.structure.MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        stack.display();

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
