package chapter8.test;

import chapter8.e8_6.Annotation;

public class TestAnnotation {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        Annotation annotation = new Annotation();   // 没有声明泛型，出现 "rawtypes" 警告信息
        annotation.setTitle("HELLO");               // 出现警告信息， 出现 "unchecked" 警告信息

        // 过期的操作
        annotation.fun();
    }
}
