package chapter4.test;

import chapter4.e4_5.AbstractClass;
import chapter4.e4_5.ExtendsAbstractClass;
import chapter4.e4_5.ExtendsStaticInnerAbstractClass;
import chapter4.e4_5.Must;

public class TestAbstractClass {
    public static void main(String[] args) {
        // 向上转型，实例化抽象类
        AbstractClass a = new ExtendsAbstractClass();
        a.print();
        // 抽象类必须有子类
        a = new Must();
        a.fun();

        // static 内部抽象类
        AbstractClass.StaticInnerAbstract as = new ExtendsStaticInnerAbstractClass();
        as.print();

        // 抽象类内的 static 方法
        AbstractClass.staticFun();

        // 隐藏内部抽象类子类
        AbstractClass abstractClass = AbstractClass.getInstance();
        abstractClass.print();

        // 属性初始化
        new ExtendsAbstractClass(30);
        System.out.println("***********");
        new ExtendsAbstractClass(30).print();

        // 模板设计模式
        AbstractClass abstractClass1 = new ExtendsAbstractClass();
        abstractClass1.fun();
    }
}
