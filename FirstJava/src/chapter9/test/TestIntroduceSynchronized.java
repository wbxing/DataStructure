package chapter9.test;

import chapter9.e9_5.IntroduceSynchronized;

public class TestIntroduceSynchronized {
    public static void main(String[] args) {
        IntroduceSynchronized th = new IntroduceSynchronized();
        new Thread(th, "Thread-A").start();
        new Thread(th, "Thread-B").start();
        new Thread(th, "Thread-C").start();
        new Thread(th, "Thread-D").start();
    }
}
