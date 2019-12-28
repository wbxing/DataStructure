package chapter3.e3_9.ISP;

public class Subitem {
    private int sid;
    private String name;
    private String note;
    private Item item;
    private Product [] products;

    public Subitem() {}
    public Subitem(int sid, String name, String note) {
        this.sid = sid;
        this.name = name;
        this.note = note;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public Item getItem() {
        return item;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getInfo() {
        return "子栏目编号：" + this.sid + "，子栏目名称：" +this.name + "，子栏目描述：" + this.note;
    }
}
