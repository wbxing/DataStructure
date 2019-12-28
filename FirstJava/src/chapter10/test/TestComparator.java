package chapter10.test;

import chapter10.e10_7.Book;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("Java", 89.9),
                new Book("Java Web", 69.9),
                new Book("Oracle", 99.9),
                new Book("Android", 79.9),
        };

        // Lambda 表达式
        Arrays.sort(books, (o1, o2) -> {
            return Double.compare(o1.getPrice(), o2.getPrice());
        });

        System.out.println(Arrays.toString(books));

        // 方法引用
        Arrays.sort(books, Comparator.comparingDouble(Book::getPrice));
        System.out.println(Arrays.toString(books));
    }
}
