package chapter3.e3_9.MemberAndCar;

public class Car {
    private String name;
    private Member mbr;         // 车属于一个人

    /**
     * 构造方法
     */
    public Car() {}
    public Car(String name) {
        this.name = name;
    }

    // setter and getter
    public void setName(String name) {
        this.name = name;
    }
    public void setMbr(Member mbr) {
        this.mbr = mbr;
    }
    public String getName() {
        return this.name;
    }
    public Member getMbr() {
        return this.mbr;
    }

    public String getInfo() {
        return "车的名字：" + this.name;
    }
}
