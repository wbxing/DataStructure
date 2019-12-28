package chapter_4;

public class GoodDog {
    private int size;

    public int getSize () {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public void bark () {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
