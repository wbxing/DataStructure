package chapter4.test;

import chapter4.e4_4.ExtendsPoly;
import chapter4.e4_4.NewExtends;
import chapter4.e4_4.Polymorphism;

public class TestPoly {
    public static void main(String[] args) {
        // 实例化子类对象
        ExtendsPoly extendsPoly = new ExtendsPoly();
        extendsPoly.print();

        //向上转型
        Polymorphism polymorphism = new ExtendsPoly();
        polymorphism.print();

        // 向下转型（强制）
        extendsPoly = (ExtendsPoly) polymorphism;
        extendsPoly.print();

        // 参数统一
        fun(new ExtendsPoly());
        fun(new NewExtends());

        // 向下转型，调用子类特殊功能
        fun(new ExtendsPoly());

        // instanceof 关键字
        Polymorphism p = new Polymorphism();
        System.out.println(p instanceof Polymorphism);
        System.out.println(p instanceof ExtendsPoly);

        p = new ExtendsPoly();
        System.out.println(p instanceof Polymorphism);
        System.out.println(p instanceof ExtendsPoly);
    }

    public static void fun(Polymorphism polymorphism) {
        polymorphism.print();
        if (polymorphism instanceof ExtendsPoly) {
            ExtendsPoly e = (ExtendsPoly) polymorphism;
            e.funB();
        }
    }
}
