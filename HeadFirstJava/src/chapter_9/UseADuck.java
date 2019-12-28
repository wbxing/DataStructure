package chapter_9;

class Duck {
    private int size;
    // 构造函数
    public Duck() {
        System.out.println("Quack");
    }

    public Duck(int size) {
        System.out.println("Quack");
        if (size == 0) {
            size = 27;
        } else {
            this.size = size;
        }
        System.out.println("size is " + this.size);

    }

    public void setSize(int size) {
        this.size = size;
    }
}

public class UseADuck {
    public static void main(String[] args) {
        // 启动构造函数
        Duck d = new Duck(42);

        // d.setSize(42);

    }
}
