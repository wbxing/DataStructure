package chapter3.test;

import chapter3.e3_8.Message;

public class TestMessage {
    public static void main(String[] args) {
        Message msg = new Message(30);
        fun(msg);
        System.out.println(msg.getNum());

        msg = new Message("Hello");
        fun(msg);
        System.out.println(msg.getInfo());
    }

    /**
     * 修改 Message 类的 num 属性内容
     * @param temp Message 类的引用
     */
    public static void fun(Message temp) {
        temp.setNum(100);
        temp.setInfo("World");
    }
}
