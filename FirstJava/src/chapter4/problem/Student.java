package chapter4.problem;

/**
 * Student继承Person，
 * 并增加输出成员math、english存放数学和英语成绩。
 * 一个六参构造方法，
 * 一个两参构造方法，
 * 一个无参构造方法，
 * 重写输出方法用于显示全部六种种属性
 */
public class Student extends Person {
    private double math;
    private double english;

    public Student() {
    }

    public Student(double math, double english) {
        super();
        this.math = math;
        this.english = english;
    }

    public Student(String name, String address, char sex, int age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\t" +
                "Student{" +
                "math=" + math +
                ", english=" + english +
                '}';
    }
}
