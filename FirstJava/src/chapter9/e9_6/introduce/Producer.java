package chapter9.e9_6.introduce;

public class Producer implements Runnable {
    private Message msg = null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                this.msg.setName("Name-A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("Content-A");
            } else {
                this.msg.setName("Name-B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("Content-B");
            }
        }
    }
}
