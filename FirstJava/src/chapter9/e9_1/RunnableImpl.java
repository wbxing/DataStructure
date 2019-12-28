package chapter9.e9_1;

public class RunnableImpl implements Runnable {
    private String name;

    public RunnableImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(this.name + "----->" + i);
        }
    }
}
