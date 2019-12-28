package chapter3.test;

import chapter3.e3_12.Outer;

public class TestOuter {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.fun();

        // 实例化内部类
        Outer.Inner1 in = new Outer().new Inner1();
        in.print();

        // 实例化外部类对象
        Outer.Inner4 inner4 = new Outer.Inner4();
        inner4.print();

        // 方法中的内部类
        new Outer().fun(10);
    }
}
