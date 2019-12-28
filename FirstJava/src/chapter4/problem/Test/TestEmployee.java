package chapter4.problem.Test;

import chapter4.problem.Employee;
import chapter4.problem.Manager;
import chapter4.problem.Staff;

public class TestEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager("zhang", 'M', 45, "manager", 2000000);
        Employee staff = new Staff("wang", 'F', 28, "staff", 2000);

        System.out.println(manager.toString());
        System.out.println(staff.toString());
    }
}
