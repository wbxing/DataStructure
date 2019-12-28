package chapter8.e8_7;

public interface InterfacePlus {
    void print();

    default void fun() {
        System.out.println("接口中的普通方法");
    }

    static void get() {
        System.out.println("接口中的静态方法");
    }
}
