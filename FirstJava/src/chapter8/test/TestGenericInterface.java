package chapter8.test;

import chapter8.e8_4.GenericInterface;
import chapter8.e8_4.GenericInterfaceImpl1;
import chapter8.e8_4.GenericInterfaceImpl2;

public class TestGenericInterface {
    public static void main(String[] args) {
        GenericInterface<String> genericInterface1 = new GenericInterfaceImpl1<>();
        GenericInterface<String> genericInterface2 = new GenericInterfaceImpl2();
        genericInterface1.print("Hello World 1");
        genericInterface2.print("Hello World 2");
    }
}
