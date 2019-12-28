package chapter3.e3_10;

public class StaticKey {
    private String title;
    private double price;
    public static String pub = "清华大学出版社";
    private static int num = 0;

    public StaticKey() {
        this("NOTITLE - "+ num++);
        System.out.println("这是第" + num + "个对象");
    }
    public StaticKey(String title) {
        this.title= title;
    }
    public StaticKey(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void setPub(String p) {
        pub = p;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public static String getPub() {
        return pub;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        StaticKey.num = num;
    }

    public static int add(int a, int b) {
        return a+b;
    }
    public String getInfo() {
        return "书名：" + this.title + "，价格：" + this.price + "，出版社：" + pub;
    }

}
