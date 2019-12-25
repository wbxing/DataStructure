package test;

import java.com.data.structure.queue.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.push(4);
        queue.push(5);
        System.out.println(queue.peek());
    }
}
