package chapter8.test;

import chapter8.e8_9.construction.Book;

public class TestMethod {
    public static void main(String[] args) {
        // 引用静态方法
        // 将 String.valueOf() 方法变为 Interface 中的 transform() 方法
        chapter8.e8_9.staticMethod.Interface<Integer, String> in1 = String::valueOf;
        String str1 = in1.transform(1000);
        System.out.println(str1);

        // 引用普通方法
        // 将 String.toUpperCase() 方法变为 Interface 中的 upper() 方法
        chapter8.e8_9.common.Interface<String> in2 = "String"::toUpperCase;
        String str2 = in2.upper();
        System.out.println(str2);

        // 引用特定方法
        // 将 String.compareTo() 方法变为 Interface 中的 compare() 方法
        chapter8.e8_9.specific.Interface<String> in3 = String::compareTo;
        System.out.println(in3.compare("A", "B"));

        // 引用构造方法
        chapter8.e8_9.construction.Interface<Book> in4 = Book::new;
        Book book = in4.creat("Java", 89.9);
        System.out.println(book);
    }
}
