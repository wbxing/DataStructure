package com.test;

import com.data.structure.StackSingleLink;

public class StackSingleLinkTest {
    public static void main(String[] args) {
        StackSingleLink myStack = new StackSingleLink();
        myStack.push("A");
        myStack.push("B");
        myStack.display();
        System.out.println(myStack.pop());
        myStack.display();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.display();
    }
}
