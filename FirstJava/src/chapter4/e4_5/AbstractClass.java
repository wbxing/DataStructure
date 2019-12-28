package chapter4.e4_5;

public abstract class AbstractClass {

    public AbstractClass() {
        this.print();
    }
    public void fun() {
        // 抽象类的普通方法中调用抽象方法
        this.print();
    }
    // 没有方法体并且存在 abstract 关键字，表示抽象方法
    public abstract void print();

    // 内部抽象类
    public abstract class InnerAbstract {
        public abstract void print();
    }

    // static 内部抽象类
    public static abstract class StaticInnerAbstract {
        public abstract void print();
    }

    // static 方法
    public static void staticFun() {
        System.out.println("抽象类中的 static 方法");
    }

    // 隐藏内部抽象类子类
    private static class B extends AbstractClass {
        public void print() {
            System.out.println("内部抽象类子类中的方法");
        }
    }

    public static AbstractClass getInstance() {
        return new B();
    }
}
