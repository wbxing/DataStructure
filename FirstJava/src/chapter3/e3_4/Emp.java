package chapter3.e3_4;

public class Emp {
    private int eno;        // 雇员编号
    private String ename;   // 雇员姓名
    private String job;     // 雇员职位
    private double sal;     // 基本工资
    private double comn;    // 佣金

    public Emp() {

    }
    public Emp(int no, String name, String j, double s, double c) {
        setEno(no);
        setEname(name);
        setJob(j);
        setJob(j);
        setSal(s);
        setComn(c);
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setComn(double comn) {
        this.comn = comn;
    }

    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public double getSal() {
        return sal;
    }

    public double getComn() {
        return comn;
    }

    /**
     * 取得基本信息
     * @return 包含完整信息的字符串
     */
    public String getInfo() {
        return "雇员编号：" + eno + "\n" +
                "雇员姓名：" + ename + "\n" +
                "雇员职位：" + job + "\n" +
                "基本工资：" + sal + "\n" +
                "佣   金：" + comn;
    }
}
