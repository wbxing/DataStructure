package chapter9.test;

import chapter9.e9_4.ThreadSleep;

public class TestThreadSleep {
    public static void main(String[] args) {
        ThreadSleep mt = new ThreadSleep();
        new Thread(mt, "Thread-A").start();
        new Thread(mt, "Thread-B").start();
        new Thread(mt, "Thread-C").start();
        new Thread(mt, "Thread-D").start();
        new Thread(mt, "Thread-E").start();
    }
}
