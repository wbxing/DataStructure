package chapter8.test;

import chapter8.e8_4.Message;

public class TestMessage {
    public static void main(String[] args) {
        Message<Integer> message1 = new Message<>();
        message1.setMsg(100);
        Message<String> message2 = new Message<>();
        message2.setMsg("Hello World");
        print(message1);
        print(message2);
    }

    public static void print(Message<?> msg) {
        System.out.println(msg.getMsg());
    }
}
