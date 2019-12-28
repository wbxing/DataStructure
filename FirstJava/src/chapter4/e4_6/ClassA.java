package chapter4.e4_6;

public class ClassA implements InterfaceA, InterfaceB {
    public void print() {
        System.out.println("InterfaceA中的抽象方法");
    }
    public void get() {
        System.out.println("InterfaceB中的抽象方法");
    }
}
