package chapter8.test;

import chapter8.e8_4.Lower;

public class TestLower {
    public static void main(String[] args) {
        Lower<String> lower = new Lower<>();
        lower.setMsg("Hello World");
        print(lower);
    }

    public static void print(Lower<? super String> msg) {
        System.out.println(msg.getMsg());
    }
}
