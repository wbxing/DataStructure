package chapter9.problem;

/**
 * 设计四个线程对象，
 * 两个线程执行减操作，
 * 两个线程执行加操作。
 */
class Message {
    private int data = 10;
    // private boolean flag = true;

    public synchronized void add() {
        if(this.data > 10) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "加法：" + (++ this.data));
        // this.flag = false;
        super.notify();
    }

    public synchronized void subtract() {
        if (this.data <= 10) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "减法：" + (-- this.data));
        // this.flag = true;
        super.notify();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class Addition implements Runnable {
    private Message msg;

    public Addition(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            this.msg.add();
        }
    }
}

class Subtraction implements Runnable {
    private Message msg;

    public Subtraction(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            this.msg.subtract();
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Addition(msg), "加法对象A").start();
        new Thread(new Subtraction(msg), "减法对象A").start();

        new Thread(new Addition(msg), "加法对象B").start();
        new Thread(new Subtraction(msg), "减法对象B").start();
    }
}
