package chapter4.test;

import chapter3.e3_13.LinkedList.Link;

public class TestLink {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("A");
        link.add("B");
        link.add("C");
        link.add("D");
        Object [] objects = link.toArray();
        for (Object o : objects) {
            String str = (String) o;
            System.out.println(str);
        }
        link.remove("C");
        objects = link.toArray();
        for (Object o : objects) {
            String str = (String) o;
            System.out.println(str);
        }
    }
}
