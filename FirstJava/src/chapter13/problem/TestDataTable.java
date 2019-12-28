package chapter13.problem;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Emp {
    private int eNo;
    private String eName;
    private String eJob;
    private double salary;
    private double comm;
    private Emp manger;
    private Dept dept;

    public Emp() {
    }

    public Emp(int eNo, String eName, String eJob, double salary, double comm) {
        this.eNo = eNo;
        this.eName = eName;
        this.eJob = eJob;
        this.salary = salary;
        this.comm = comm;
    }

    public int getENo() {
        return eNo;
    }

    public void setENo(int eNo) {
        this.eNo = eNo;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getEJob() {
        return eJob;
    }

    public void setEJob(String eJob) {
        this.eJob = eJob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Emp getManger() {
        return manger;
    }

    public void setManger(Emp manger) {
        this.manger = manger;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return eNo == emp.eNo &&
                Double.compare(emp.salary, salary) == 0 &&
                Double.compare(emp.comm, comm) == 0 &&
                Objects.equals(eName, emp.eName) &&
                Objects.equals(eJob, emp.eJob) &&
                Objects.equals(manger, emp.manger) &&
                Objects.equals(dept, emp.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eNo, eName, eJob, salary, comm, manger, dept);
    }

    @Override
    public String toString() {       // 取得雇员信息
        return "雇员编号：" + this.eNo + "，姓名：" + this.eName + "，职位：" + this.eJob  + "，工资：" + this.salary
                + "，佣金：" + this.comm;
    }
}

class Dept {
    private int dNo;
    private String dName;
    private String loc;
    private List<Emp> emps;

    public Dept() {
        this.emps = new ArrayList<Emp>();
    }

    public Dept(int dNo, String dName, String loc) {
        this();
        this.dNo = dNo;
        this.dName = dName;
        this.loc = loc;
    }

    public int getdNo() {
        return dNo;
    }

    public void setdNo(int dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "部门编号：" + this.dName + "，部门名称：" + this.dName + "，位置：" + this.loc;
    }
}

public class TestDataTable {
    public static void main(String args[]) {
        // 1、第一层配置关系
        Dept dept = new Dept(10, "ACCOUNTING", "New York");
        Emp empa = new Emp(7369, "SMITH", "CLERK", 800.0, 0.0);
        Emp empb = new Emp(7566, "ALLEN", "MANAGER", 2450.0, 0.0);
        Emp empc = new Emp(7839, "KING", "PRESIDENT", 5000.0, 0.0);
        // 设置雇员和领导的关系
        empa.setManger(empb);
        // 设置雇员和领导的关系
        empb.setManger(empc);
        // 每个雇员属于一个部门
        empa.setDept(dept);
        empb.setDept(dept);
        empc.setDept(dept);

        // 每一个部门有多个雇员，通过对象数组表示多个雇员
        dept.getEmps().add(empa);
        dept.getEmps().add(empb);
        dept.getEmps().add(empc);

        // 2、第二层取得关系
        System.out.println(dept);
        for (Emp emp : dept.getEmps()) {
            System.out.println(emp);
            if (emp.getManger() != null) {
                // 有领导
                System.out.println("\t" + emp.getManger());
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
