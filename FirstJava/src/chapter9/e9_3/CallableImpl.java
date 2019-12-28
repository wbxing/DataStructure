package chapter9.e9_3;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    private int ticket = 10;

    @Override
    public String call() {
        for (int i = 0; i < 100; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票：ticket = " + this.ticket --);
            }
        }
        return "票已卖光";
    }
}
