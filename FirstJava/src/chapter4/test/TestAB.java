package chapter4.test;

import chapter4.e4_2.B;

public class TestAB {
    public static void main(String[] args) {
        B b = new B();
        b.setMsg("Hello");
        System.out.println(b.getMsg());

        new B();

        new B("hello");

    }
}
