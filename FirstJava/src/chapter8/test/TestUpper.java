package chapter8.test;

import chapter8.e8_4.Upper;

public class TestUpper {
    public static void main(String[] args) {
        Upper<Integer> upper = new Upper<>();
        upper.setMsg(100);
        print(upper);
    }

    public static void print(Upper<? extends Number> msg) {
        System.out.println(msg.getMsg());
    }
}
