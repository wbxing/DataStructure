package chapter13.e13_3;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetBook {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Java", 89.9));
        bookSet.add(new Book("Java", 89.9));    // 重复元素
        bookSet.add(new Book("JSP", 69.9));
        bookSet.add(new Book("Oracle", 79.9));
        System.out.println(bookSet);
    }
}
