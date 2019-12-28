package chapter3.e3_9.EmpAndDept;

public class Dept {
    private int id;             // 部门编号
    private String name;        // 部门名称
    private String location;    // 部门位置
    private Emp [] emps;        // 多个雇员

    /**
     * 构造函数
     */
    public Dept() {}
    public Dept(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmp(Emp[] emps) {
        this.emps = emps;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Emp[] getEmp() {
        return emps;
    }

    public String getInfo() {
        return "部门编号：" + this.id +
                "，名称：" + this.name +
                "，位置：" + this.location;
    }
}
