package chapter13.e13_2;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("Hello");
        sets.add("Hello");  // 重复数据
        sets.add("World");
        sets.add("xyz");
        sets.add("abc");
        System.out.println(sets);
    }
}
