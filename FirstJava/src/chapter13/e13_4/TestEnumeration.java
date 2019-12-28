package chapter13.e13_4;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        vector.add("e");
        vector.add("f");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String str = enumeration.nextElement();
            System.out.println(str);
        }
    }
}
