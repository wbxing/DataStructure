package chapter13.e13_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        Collections.addAll(a, "A", "B", "C", "D", "E");
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
    }
}
