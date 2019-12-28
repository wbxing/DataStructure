package chapter3.problem.Test;

import chapter3.problem.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account("zhang", 5000.0);
        System.out.println(acc);
        System.out.println("账户余额：" + acc.getBalance());
    }
}
