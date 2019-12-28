package chapter13.e13_10;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.forEach(System.out::println);

    }
}
