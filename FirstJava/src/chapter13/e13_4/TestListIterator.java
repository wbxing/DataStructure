package chapter13.e13_4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("由前向后输出：");
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            System.out.print("\t" + str + " ");
        }
        System.out.println("\n由后向前输出：");
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.print("\t" + str + " ");
        }

    }
}
