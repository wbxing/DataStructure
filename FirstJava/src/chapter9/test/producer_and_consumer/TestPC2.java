package chapter9.test.producer_and_consumer;

import chapter9.e9_6.update1.Message;
import chapter9.e9_6.update1.Producer;
import chapter9.e9_6.update1.Consumer;

public class TestPC2 {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
