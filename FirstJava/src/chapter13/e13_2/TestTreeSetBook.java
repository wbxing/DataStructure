package chapter13.e13_2;


import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetBook {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("Java", 89.9));
        bookSet.add(new Book("Java", 99.9));
        bookSet.add(new Book("JSP", 69.9));
        bookSet.add(new Book("Oracle", 79.9));
        System.out.println(bookSet);
    }
}
