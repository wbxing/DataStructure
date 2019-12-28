package chapter3.test;

import chapter3.e3_2.NewBook;

public class TestNewBook {
    public static void main(String[] args) {
        // 无参构造
        NewBook newBookA = new NewBook();
        newBookA.setTitle("Java 开发");
        newBookA.setPrice(-89.9);
        newBookA.getInfo();

        // 带参数的构造方法
        NewBook newBookB = new NewBook("Java 开发", 89.9);
        newBookB.getInfo();

        // 匿名对象
        new NewBook("Jsp 开发", 69.9).getInfo();

        // 对象比较
        newBookA = new NewBook("Java", 79.8);
        newBookB = new NewBook("Java", 79.8);
        if (newBookA.getTitle().equals(newBookB.getTitle()) && newBookA.getPrice() == newBookB.getPrice()) {
            System.out.println("是同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }

}
}
