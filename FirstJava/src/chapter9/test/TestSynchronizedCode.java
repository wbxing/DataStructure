package chapter9.test;

import chapter9.e9_5.SynchronizedCode;

public class TestSynchronizedCode {
    public static void main(String[] args) {
        SynchronizedCode th = new SynchronizedCode();
        new Thread(th, "Thread-A").start();
        new Thread(th, "Thread-B").start();
        new Thread(th, "Thread-C").start();
        new Thread(th, "Thread-D").start();
    }
}
