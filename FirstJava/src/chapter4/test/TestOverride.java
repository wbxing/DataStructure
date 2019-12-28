package chapter4.test;

import chapter4.e4_2.B;
import chapter4.e4_2.C;

public class TestOverride {
    public static void main(String[] args) {
        B b = new B();
        b.fun();

        C c = new C();
        c.fun();

        b.print();
    }
}
