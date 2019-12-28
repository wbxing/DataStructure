package chapter3.e3_9.EmpAndDept;

public class Emp {
    private int id;         // 雇员编号
    private String name;    // 雇员姓名
    private String job;     // 雇员职位
    private double salary;  // 基本工资
    private double comm;    // 佣金
    private Dept dept;      // 部门
    private Emp mgr;        // 领导

    /**
     * 构造函数
     */
    public Emp() {}
    public Emp(int id, String name, String job, double salary, double comm) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.comm = comm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public double getComm() {
        return comm;
    }

    public Dept getDept() {
        return dept;
    }

    public Emp getMgr() {
        return mgr;
    }

    public String getInfo() {
        return "雇员编号：" + this.id +
                "，姓名：" + this.name +
                "，职位：" + this.job +
                "，工资：" + this.salary +
                "，佣金：" + this.comm;
    }
}
