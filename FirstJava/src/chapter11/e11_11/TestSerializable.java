package chapter11.e11_11;

import java.io.*;

// 对象可以被序列化的类
class Book implements Serializable {
    private String title;
    private double price;
    // transient 关键字定义不能被序列化的属性
    private transient String pub;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class TestSerializable {
    public static void main(String[] args) {
//        try {
//            ser();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            dSer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ser() throws Exception {
        String path = "test" + File.separator;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path + "book.ser")));
        // 序列化对象
        oos.writeObject(new Book("Java", 89.9));
        oos.close();
    }

    private static void dSer() throws Exception {
        String path = "test" + File.separator;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path + "book.ser")));
        // 对象反序列化
        Object obj = ois.readObject();
        Book book = (Book) obj;
        System.out.println(book);
        ois.close();
    }
}
