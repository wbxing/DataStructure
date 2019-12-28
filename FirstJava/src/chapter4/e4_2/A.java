package chapter4.e4_2;

public class A {
    private String msg;
    int Info = 10;
    final double GOOD = 100;    // 常量
    public static final int MAX = 1000000;  // 全局常量

    public A () {
        System.out.println("A的无参构造");
    }

    public A (String msg) {
        System.out.println("A的有参构造");
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void fun() {
        System.out.println("A类中的fun方法");
    }

    public final void function() {}     // 此方法不允许被子类覆写
}
