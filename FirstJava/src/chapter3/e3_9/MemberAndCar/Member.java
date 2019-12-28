package chapter3.e3_9.MemberAndCar;

public class Member {
    private int id;         // 人员编号
    private String name;    // 人员姓名
    private Car car;        // 表示属于人的车
    private Member child;   // 人的孩子

    /**
     * 构造方法
     */
    public Member() {}
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // setter and getter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void setChild(Member child) {
        this.child = child;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Car getCar() {
        return this.car;
    }
    public Member getChild() {
        return this.child;
    }

    // getInfo
    public String getInfo() {
        return "人员编号：" + this.id + "，姓名：" + this.name;
    }

}
