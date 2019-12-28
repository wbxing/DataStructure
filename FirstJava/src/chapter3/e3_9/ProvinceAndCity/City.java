package chapter3.e3_9.ProvinceAndCity;

public class City {
    private int cid;
    private String name;
    private Province province;

    public City() {}
    public City(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public String getName() {
        return name;
    }

    public Province getProvince() {
        return province;
    }

    public String getInfo() {
        return "城市编号：" + this.cid + "，名称：" + this.name;
    }
}
