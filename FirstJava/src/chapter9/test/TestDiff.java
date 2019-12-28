package chapter9.test;

import chapter9.e9_2.ExtendThread;
import chapter9.e9_2.RunnableImpl;

public class TestDiff {
    public static void main(String[] args) {

        // Thread 类实现多线程，没有数据共享
        ExtendThread mt1 = new ExtendThread();
        ExtendThread mt2 = new ExtendThread();
        ExtendThread mt3 = new ExtendThread();

//        mt1.start();
//        mt2.start();
//        mt3.start();

        // 数据共享模式, 不推荐
//        System.out.println("Thread 的数据共享模式：");
//        ExtendThread mt = new ExtendThread();
//        new Thread(mt).start();
//        new Thread(mt).start();
//        new Thread(mt).start();

        // Runnable 方式
        System.out.println("Thread 的数据共享模式：");
        RunnableImpl mt4 = new RunnableImpl();
        new Thread(mt4).start();
        new Thread(mt4).start();
        new Thread(mt4).start();

    }
}
