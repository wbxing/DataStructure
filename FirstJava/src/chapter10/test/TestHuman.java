package chapter10.test;

import chapter10.e10_3.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human man = new Human();
        // 产生垃圾
        man = null;
        // 手工处理垃圾收集
        System.gc();
    }
}
