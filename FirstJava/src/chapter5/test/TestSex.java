package chapter5.test;

import chapter5.e5_4.Sex;

public class TestSex {
    public static void main(String[] args) {
        Sex man = Sex.getInstance("man");
        Sex woman = Sex.getInstance("woman");

        System.out.println(man);
        System.out.println(woman);
    }
}
