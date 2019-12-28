package chapter9.e9_6.update1;


public class Producer implements Runnable {
    private Message msg = null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                this.msg.set("Name-A", "Content-A");
            } else {
                this.msg.set("Name-B", "Content-B");
            }
        }
    }
}
