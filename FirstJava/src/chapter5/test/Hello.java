package chapter5.test;      // 定义包

import chapter5.e5_1.uitl.ClassA;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 需要带上包名引用
        chapter5.e5_1.uitl.Message message = new chapter5.e5_1.uitl.Message();
        message.print();

        ClassA classA = new ClassA();
        classA.funA();
        chapter5.e5_1.xwb.Message message1 = new chapter5.e5_1.xwb.Message();
        message1.print();

    }
}
