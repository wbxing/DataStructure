package chapter3.e3_7;

public class NewEmp {
    private int eno;        // 雇员编号
    private String ename;   // 雇员姓名
    private double sal;     // 基本工资
    private String dept;    // 部门

    // 无参构造
    public NewEmp() {
        this(0, "无名氏", 0.0, "未定");
    }
    // 单参构造
    public NewEmp(int eno) {
        this(eno, "临时工", 800.0, "后勤部");
    }
    // 双参构造
    public NewEmp(int eno, String ename) {
        this(eno, ename, 2000.0, "技术部");
    }
    // 四参构造
    public NewEmp(int eno, String ename, double sal, String dept) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public double getSal() {
        return sal;
    }

    /**
     * 取得基本信息
     * @return 包含完整信息的字符串
     */
    public String getInfo() {
        return "雇员编号：" + eno + "\t" +
                "雇员姓名：" + ename + "\t" +
                "基本工资：" + sal;
    }
}
