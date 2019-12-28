package chapter8.test;

import chapter8.e8_7.InterfaceImpl;
import chapter8.e8_7.InterfacePlus;

public class TestInterfacePlus {
    public static void main(String[] args) {
        InterfacePlus interfacePlus = new InterfaceImpl();
        // 调用覆写之后的方法
        interfacePlus.print();
        // 调用接口中的普通方法
        interfacePlus.fun();

        // 调用接口中的静态方法
        InterfacePlus.get();
    }
}
