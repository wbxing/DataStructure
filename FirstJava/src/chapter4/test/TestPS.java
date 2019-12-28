package chapter4.test;

import chapter4.e4_1.Student;

public class TestPS {
    public static void main(String[] args) {
        Student stu = new Student();
        // 继承的父类的方法
        stu.setName("zhang");
        stu.setAge(24);
        System.out.println("Name: " + stu.getName());
        System.out.println("\tAge: " + stu.getAge());
        // 自己的方法
        stu.setSchool("Tsinghua");
        System.out.println("\tSchool: " + stu.getSchool());
    }
}
