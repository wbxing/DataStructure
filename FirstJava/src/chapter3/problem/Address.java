package chapter3.problem;

/**
 * 编写并测试一个代表地址的Address类
 * 地址信息由：国家，省份，城市，街道，邮编组成
 * 返回完整的地址信息
 */
public class Address {
    private String national;
    private String provincial;
    private String city;
    private String street;
    private String PostalCode;

    public Address() {}
    public Address(String national, String provincial, String city, String street, String PostalCode) {
        super();
        this.national = national;
        this.provincial = provincial;
        this.city = city;
        this.street = street;
        this.PostalCode = PostalCode;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getNational() {
        return national;
    }

    public String getProvincial() {
        return provincial;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String toString() {
        return "国家：" + this.national +
                "，省份：" + this.provincial +
                "，城市：" + this.city +
                "，街道：" + this.street +
                "，邮政编码：" + this.PostalCode;
    }
}
