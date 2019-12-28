package chapter3.e3_9.ISP;

public class Item {
    private int iid;
    private String name;
    private String note;
    private Subitem [] subitems;
    private Product [] products;

    public Item() {}
    public Item(int iid, String name, String note) {
        this.iid = iid;
        this.name = name;
        this.note = note;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSubitems(Subitem[] subitems) {
        this.subitems = subitems;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getIid() {
        return iid;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public Subitem[] getSubitems() {
        return subitems;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getInfo() {
        return "栏目编号：" + this.iid + "，栏目名称：" + this.name + "，栏目描述：" + this.note;
    }
}
