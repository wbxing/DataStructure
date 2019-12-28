package chapter3.test;

import chapter3.e3_7.NewEmp;

public class TestNewEmp {
    public static void main(String[] args) {
        NewEmp [] emps = new NewEmp[4];
        emps[0] = new NewEmp();
        emps[1] = new NewEmp(7369);
        emps[2] = new NewEmp(7566, "ALLEN");
        emps[3] = new NewEmp(7839, "KING", 5000, "财务部");
        for (NewEmp ne : emps) {
            System.out.println(ne.getInfo());
        }
    }
}
