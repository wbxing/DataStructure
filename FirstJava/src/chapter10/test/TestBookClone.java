package chapter10.test;

import chapter10.e10_4.Book;

public class TestBookClone {
    public static void main(String[] args) throws Exception {
        Book bookA = new Book("Java", 89.9);
        Book bookB = (Book) bookA.clone();
        bookB.setName("JSP");
        System.out.println(bookA);
        System.out.println(bookB);
    }
}
