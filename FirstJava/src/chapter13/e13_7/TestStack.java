package chapter13.e13_7;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        // 后进先出的数据结构
        Stack<String> stringStack = new Stack<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
