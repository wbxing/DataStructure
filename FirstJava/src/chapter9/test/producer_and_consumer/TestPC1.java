package chapter9.test.producer_and_consumer;

import chapter9.e9_6.introduce.Consumer;
import chapter9.e9_6.introduce.Message;
import chapter9.e9_6.introduce.Producer;

public class TestPC1 {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
