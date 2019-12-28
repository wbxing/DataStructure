package chapter4.e4_2;

public class B extends A {
    private int Info = 100;
    public B() {
        super();    // 父类之中存在无参构造，加与不加无区别，必须在首行
        System.out.println("B的无参构造");
    }

    public B(String msg) {
        super(msg);    // 明确调用父类有参构造
        System.out.println("B的有参构造");
    }

    public void fun() {
        super.fun();
        System.out.println("B类中的fun方法");
    }

    public void print() {
        System.out.println(super.Info);
        System.out.println(this.Info);
    }
}
