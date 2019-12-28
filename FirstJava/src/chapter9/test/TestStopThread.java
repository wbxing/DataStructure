package chapter9.test;

import chapter9.e9_7.StopThread;

public class TestStopThread {
    public static void main(String[] args) {
        StopThread th = new StopThread();
        Thread t = new Thread(th, "Thread");
        t.start();
        th.stop();
    }
}
