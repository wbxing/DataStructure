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

        // 字符串反转
        stringReversal("Hello World!");
    }

    // 利用栈实现字符串反转
    public static void stringReversal(String s) {
        ArrayStack stack = new ArrayStack();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
