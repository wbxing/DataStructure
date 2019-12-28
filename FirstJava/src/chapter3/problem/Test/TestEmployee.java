package chapter3.problem.Test;

import chapter3.problem.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(7369, "SMITH", 1000, 1.5);
        emp.growthin() ;         // 工资增长
        System.out.println(emp);
    }
}
