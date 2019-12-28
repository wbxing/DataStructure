package chapter3.e3_9.ISP;

public class Product {
    private int pid;
    private String name;
    private double price;
    private Item item;
    private Subitem subitem;

    public Product() {}
    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSubitem(Subitem subitem) {
        this.subitem = subitem;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Item getItem() {
        return item;
    }

    public Subitem getSubitem() {
        return subitem;
    }

    public String getInfo() {
        return "商品编号：" + this.pid + "，商品名称：" + this.name + "，商品价格：" +this.price;
    }
}
