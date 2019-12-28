package chapter3.e3_2;

public class NewBook {
    private String title;
    private double price;
    /**
     * 无参构造方法
     */
    public NewBook() {
        System.out.println("NewBook");
    }
    /**
     * 构造方法
     * @param title 属性的内容
     */
    public NewBook (String title) {
        this();
        this.title = title;
    }
    /**
     * 构造方法
     * @param title 属性的内容
     * @param price 属性的内容
     */
    public NewBook(String title, double price) {
        //this();
        // this 调用本类属性
        //this.title = title;
        this(title);
        this.price = price;
    }
    public String getInfo() {
        // this 调用本类方法
        this.print();
        return "图书名称：" + title + "，价格：" + price;
    }

    public void print() {
        // this 表示当前对象
        System.out.println("this = " + this);
    }

    // Setter 和 Getter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }
}
