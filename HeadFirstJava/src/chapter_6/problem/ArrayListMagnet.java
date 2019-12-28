package chapter_6.problem;

import java.util.ArrayList;

public class ArrayListMagnet {
    private static void printAL (ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "chapter_1");
        a.add(2, "chapter_2");
        a.add(3, "chapter_3");
        printAL(a);
        if (a.contains("chapter_3")) {
            a.add("chapter_4");
        }
        a.remove(2);
        printAL(a);
        if (a.indexOf("chapter_4") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        if (a.contains("chapter_2")) {
            a.add("2.2");
        }
        printAL(a);
    }
}
