package chapter4.test;

import chapter4.e4_6.ClassA;
import chapter4.e4_6.InterfaceA;
import chapter4.e4_6.InterfaceB;

public class TestInterface {
    public static void main(String[] args) {
        ClassA x = new ClassA();
        InterfaceA a = x;
        InterfaceB b = x;
        a.print();
        b.get();
        System.out.println(InterfaceA.MSG);


        // 接口的转换
        a = new ClassA();
        b = (InterfaceB) a;
        b.get();
        System.out.println(a instanceof InterfaceA);
        System.out.println(a instanceof InterfaceB);
    }
}
