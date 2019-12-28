package chapter13.e13_2;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> sets = new TreeSet<>();
        sets.add("Hello");
        sets.add("Hello");  // 重复数据
        sets.add("World");
        sets.add("xyz");
        sets.add("abc");
        sets.add("ABC");
        System.out.println(sets);
    }
}
