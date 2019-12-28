package chapter9.test.producer_and_consumer;

import chapter9.e9_6.update2.Consumer;
import chapter9.e9_6.update2.Message;
import chapter9.e9_6.update2.Producer;

public class TestPC3 {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
