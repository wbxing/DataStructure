package chapter3.problem;

/**
 * 定义并测试一个代表员工的Employee类。
 * 员工属性包括“编号”、“姓名”、“基本薪水”、“薪水增长额”
 * 包括 “计算增长后的工资总额”的操作方法。
 */
public class Employee {
    // 雇员编号
    private int empno ;
    // 雇员姓名
    private String ename ;
    // 基本工资
    private double sal ;
    // 工资增长额
    private double rate ;

    public Employee() {}

    public Employee(int empno, String ename, double sal, double rate) {
        super();
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.rate = rate;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSal() {
        return sal;
    }

    public double getRate() {
        return rate;
    }

    public String toString() {
        return "雇员编号：" + this.empno + "，雇员姓名：" + this.ename + "，基本工资：" + this.sal ;
    }
    public void growthin() {     // 增长薪水
        this.sal = this.sal * this.rate ;
    }
}
