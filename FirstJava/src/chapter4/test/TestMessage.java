package chapter4.test;

import chapter4.e4_9.Message;
import chapter4.e4_9.MessageImpl;

public class TestMessage {
    public static void main(String[] args) {
        fun(new MessageImpl());
        // 等价于：匿名内部类
        fun(new Message() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });
        // 等价于 lambda 形式
        fun(() -> System.out.println("Hello World!"));
    }
    public static void fun(Message msg) {
        msg.print();
    }
}
