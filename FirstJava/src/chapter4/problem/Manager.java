package chapter4.problem;

/**
 * 定义管理层类，继承员工类，
 * 并有自己的属性：职务，年薪。
 */
public class Manager extends Employee {
    private String job;
    private double income;

    public Manager() {
    }

    public Manager(String job, double income) {
        this.job = job;
        this.income = income;
    }

    public Manager(String name, char sex, int age, String job, double income) {
        super(name, sex, age);
        this.job = job;
        this.income = income;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t" +
                "Manager{" +
                "job='" + job + '\'' +
                ", income=" + income +
                '}';
    }
}
