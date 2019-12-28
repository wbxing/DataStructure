package chapter9.test;

import chapter9.e9_1.ExtendThread;
import chapter9.e9_1.RunnableImpl;

public class TestThread {
    public static void main(String[] args) {
        // 继承 Thread 类
        ExtendThread mt1 = new ExtendThread("Thread1: ");
        ExtendThread mt2 = new ExtendThread("Thread2: ");
        ExtendThread mt3 = new ExtendThread("Thread3: ");

        // 非多线程方式
//        mt1.run();
//        mt2.run();
//        mt3.run();

        // 多线程方式
        mt1.start();
        mt2.start();
        mt3.start();

        // 实现 Runnable 接口
        Runnable mt4 = new RunnableImpl("Thread4: ");
        Runnable mt5 = new RunnableImpl("Thread5: ");
        Runnable mt6 = new RunnableImpl("Thread6: ");

        new Thread(mt4).start();
        new Thread(mt5).start();
        new Thread(mt6).start();

        // Lambda 表达式实现多线程
        String name = "Thread";
        new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println(name + "----->" + i);
            }
        }).start();
    }
}
