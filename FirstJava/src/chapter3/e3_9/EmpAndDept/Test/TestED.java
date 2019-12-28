package chapter3.e3_9.EmpAndDept.Test;

import chapter3.e3_9.EmpAndDept.Dept;
import chapter3.e3_9.EmpAndDept.Emp;

public class TestED {
    public static void main(String[] args) {
        // 设置独立对象
        Dept dept = new Dept(10, "ACCOUNTING", "New York");
        Emp [] emps = new Emp[3];
        emps[0] = new Emp(7369, "zhang", "CLEAR", 800, 0.0);
        emps[1] = new Emp(7902, "zhao", "MANAGE", 2450, 0.0);
        emps[2] = new Emp(7839, "wang", "PRESIDENT", 5000, 0.0);

        emps[0].setMgr(emps[1]);
        emps[1].setMgr(emps[2]);

        for (Emp emp : emps) {
            emp.setDept(dept);
        }

        dept.setEmp(emps);

        System.out.println(emps[0].getInfo());
        System.out.println("\t|-" + emps[0].getMgr().getInfo());
        System.out.println("\t|-" + emps[0].getDept().getInfo());

        System.out.println(dept.getInfo());
        for (Emp emp : dept.getEmp()) {
            System.out.println("\t|-" + emp.getInfo());
            if (emp.getMgr() != null) {
                System.out.println("\t\t|-" + emp.getMgr().getInfo());
            }
        }
    }
}
