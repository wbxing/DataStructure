package chapter6.test;

import chapter6.e6_3.ThrowsKey;

public class TestThrows {
    public static void main(String[] args) {
        try {       // div()方法抛出异常，必须进行异常处理
            System.out.println(ThrowsKey.div(10, 2));
            System.out.println(ThrowsKey.div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
