package chapter9.e9_7;

public class StopThread implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (this.flag) {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + (i++));
        }
    }

    public void stop() {
        this.flag = false;
    }
}
