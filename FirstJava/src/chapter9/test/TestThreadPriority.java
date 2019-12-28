package chapter9.test;

import chapter9.e9_4.ThreadSleep;

public class TestThreadPriority {
    public static void main(String[] args) {
        ThreadSleep mt = new ThreadSleep();
        Thread t1 = new Thread(mt, "Thread-A");
        Thread t2 = new Thread(mt, "Thread-B");
        Thread t3 = new Thread(mt, "Thread-C");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
