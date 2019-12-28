package chapter9.e9_2;

public class ExtendThread extends Thread {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票：ticket = " + this.ticket --);
            }
        }
    }
}
