package chapter9.e9_5;

public class SynchronizedCode implements Runnable {
    private int ticket = 50;
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            synchronized (this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": 卖票：ticket = " + this.ticket--);
                }
            }
        }
    }
}

