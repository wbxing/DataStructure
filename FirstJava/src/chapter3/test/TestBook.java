package chapter3.test;

import chapter3.e3_1.Book;

public class TestBook {
    public static void main(String[] args) {
        //Book bk = new Book();
        Book bk = null;
        bk = new Book();
        bk.title = "Java 开发";
        bk.price = 89.9;
        bk.getInfo();

        // 引用数据
        Book bookA = new Book();
        Book bookB = new Book();
        bookA.title = "Java 开发";
        bookA.price = 89.9;
        bookB.title = "Jsp 开发";
        bookB.price = 69.9;
        bookA.getInfo();
        bookB.getInfo();

        // 对象引用传递
        Book bkA = new Book();
        Book bkB = null;
        bkA.title = "Java 开发";
        bkA.price = 89.9;
        bkB = bkA;
        bkB.price = 69.8;
        bkA.getInfo();

        // 引用传递
        bookB = bookA;
        bookB.price = 100.1;
        bookA.getInfo();

        // 封装性
        Book book = new Book();
        book.title = "Java 开发";
        book.price = -89.9;
        book.getInfo();

        Book b1 = new Book("Java", 89.9);
        Book b2 = new Book("Java", 89.9);
        if (b1.compare(b2)) {
            System.out.println("是同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }
    }

}
