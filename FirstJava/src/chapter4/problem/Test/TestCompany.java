package chapter4.problem.Test;

import chapter4.problem.ClassName;
import chapter4.problem.Company;

/**
 * 编写应用程序使用Company类。
 */
public class TestCompany {
    public static void main(String[] args) {
        ClassName name = new Company();
        System.out.println(name.getClassName());
    }
}
