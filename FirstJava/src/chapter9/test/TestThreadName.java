package chapter9.test;

import chapter9.e9_4.ThreadName;

public class TestThreadName {
    public static void main(String[] args) {
        ThreadName threadName = new ThreadName();
        // 线程命名
//        new Thread(threadName, "Thread-A").start();
//        new Thread(threadName).start();
//        new Thread(threadName, "Thread-B").start();
//        new Thread(threadName).start();
//        new Thread(threadName).start();

        // 取得线程名称
        new Thread(threadName, "Thread-A").start();
        threadName.run();
    }
}
