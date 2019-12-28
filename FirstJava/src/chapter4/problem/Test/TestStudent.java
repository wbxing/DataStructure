package chapter4.problem.Test;

import chapter4.problem.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("zhang", "Shanghai", 'M', 20, 100, 90);
        System.out.println(student1.toString());

        Student student2 = new Student();
        System.out.println(student2.toString());

        Student student3 = new Student(100, 78);
        System.out.println(student3.toString());
    }
}
