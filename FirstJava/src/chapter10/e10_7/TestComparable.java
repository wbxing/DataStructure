package chapter10.e10_7;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Book [] books = new Book[] {
                new Book("Java", 89.9),
                new Book("Java Web", 69.9),
                new Book("Oracle", 99.9),
                new Book("Android", 79.9),
        };
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}
