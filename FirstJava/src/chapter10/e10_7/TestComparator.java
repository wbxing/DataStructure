package chapter10.e10_7;

import java.util.Arrays;
import java.util.Comparator;

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class TestComparator {
    public static void main(String[] args) {
        Book [] books = new Book[] {
                new Book("Java", 89.9),
                new Book("Java Web", 69.9),
                new Book("Oracle", 99.9),
                new Book("Android", 79.9),
        };
        Arrays.sort(books, new BookComparator());
        System.out.println(Arrays.toString(books));
    }
}