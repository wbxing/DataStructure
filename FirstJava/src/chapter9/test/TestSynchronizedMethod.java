package chapter9.test;

import chapter9.e9_5.SynchronizedMethod;

public class TestSynchronizedMethod {
    public static void main(String[] args) {
        SynchronizedMethod th = new SynchronizedMethod();
        new Thread(th, "Thread-A").start();
        new Thread(th, "Thread-B").start();
        new Thread(th, "Thread-C").start();
        new Thread(th, "Thread-D").start();
    }
}
