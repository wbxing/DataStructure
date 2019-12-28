package chapter9.e9_1;

public class ExtendThread extends Thread {
    private String name;

    public ExtendThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(this.name + "------>" + i);
        }
    }
}
