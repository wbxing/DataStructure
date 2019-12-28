package chapter3.problem;

/**
 * 编写一个银行帐户类,类的构成包括：
 * 数据成员：用户的帐户名称、用户的帐户余额；
 * 方法包括：开户（设置帐户名称，及余额）；利用构造方法完成；查询余额
 */
public class Account {
    private String name ;
    private double balance ;

    public Account() {}
    public Account(String name, double balance) {
        super();
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "账户名称：" + this.name + "，余额：" + this.balance;
    }
}
