package chapter3.test;

import chapter3.e3_11.CodeDemo;

public class TestCodeDemo {
    public static void main(String[] args) {
        {
            // 普通代码块
            int num = 10;
            System.out.println("num = " + num);
        }

        int num = 100;
        System.out.println("num = " + num);

        // 构造块，静态块
        new CodeDemo();
        new CodeDemo();
    }
    // 优先于主方法执行
    static {
        System.out.println("主类中的静态块");
    }
}
