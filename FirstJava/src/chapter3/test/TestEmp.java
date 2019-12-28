package chapter3.test;

import chapter3.e3_4.Emp;

public class TestEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        emp1.setEno(7369);
        emp1.setEname("SMITH");
        emp1.setJob("CLERK");
        emp1.setSal(800.0);
        emp1.setComn(1.0);

        Emp emp2 = new Emp(7369, "SMITH", "CLERK", 800.0, 1.0);

        System.out.println(emp1.getInfo());
        System.out.println();
        System.out.println(emp2.getInfo());

        // Setter 可以用来修改信息
        System.out.println();
        emp2.setEname("Jack");
        System.out.println(emp2.getInfo());
    }
}
