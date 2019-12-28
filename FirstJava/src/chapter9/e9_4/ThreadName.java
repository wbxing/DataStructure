package chapter9.e9_4;

public class ThreadName implements Runnable {
    @Override
    public void run() {
        // 获取当前线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
