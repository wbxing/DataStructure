package chapter13.e13_4;

import java.util.ArrayList;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
