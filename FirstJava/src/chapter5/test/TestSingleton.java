package chapter5.test;

import chapter5.e5_3.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
        System.out.println(singleton5);
    }
}
