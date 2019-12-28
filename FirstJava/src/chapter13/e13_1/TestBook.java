package chapter13.e13_1;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java", 89.9));
        bookList.add(new Book("JSP", 69.9));
        bookList.add(new Book("Oracle", 79.9));
        bookList.remove(new Book("Oracle", 79.9));
        System.out.println(bookList);
    }
}
