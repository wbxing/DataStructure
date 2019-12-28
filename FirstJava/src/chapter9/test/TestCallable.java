package chapter9.test;

import chapter9.e9_3.CallableImpl;

import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) throws Exception {
        CallableImpl c1 = new CallableImpl();
        CallableImpl c2 = new CallableImpl();

        FutureTask<String> task1 = new FutureTask<>(c1);
        FutureTask<String> task2 = new FutureTask<>(c2);

        // 启动线程
        new Thread(task1).start();
        new Thread(task2).start();

        // 获取返回结果
        System.out.println("Thread1: " + task1.get());
        System.out.println("Thread2: " + task2.get());
    }
}
