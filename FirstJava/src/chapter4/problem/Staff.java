package chapter4.problem;

/**
 * 定义职员类，继承员工类，并有自己的属性：所属部门，月薪。
 */
public class Staff extends Employee {
    private String dept;
    private double salary;

    public Staff() {
    }

    public Staff(String dept, double salary) {
        this.dept = dept;
        this.salary = salary;
    }

    public Staff(String name, char sex, int age, String dept, double salary) {
        super(name, sex, age);
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" +
                "Staff{" +
                "dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
