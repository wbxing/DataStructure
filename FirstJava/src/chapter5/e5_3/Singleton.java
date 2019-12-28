package chapter5.e5_3;

public class Singleton {
    // 本类内部实例化对象
    private static final Singleton singleton = new Singleton();
    // 私有化构造方法
    private Singleton() {}
    public void print() {
        System.out.println("Singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
