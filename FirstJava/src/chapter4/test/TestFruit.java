package chapter4.test;

import chapter4.e4_6.Application.Factory.Factory;
import chapter4.e4_6.Application.Factory.Fruit;
import chapter4.e4_6.Application.Factory.Apple;
import chapter4.e4_6.Application.Factory.Orange;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.eat();

        fruit = new Orange();
        fruit.eat();

        // 通过工厂类取得对象
        fruit = Factory.getInstance("apple");
        assert fruit != null;
        fruit.eat();

        fruit = Factory.getInstance("orange");
        assert fruit != null;
        fruit.eat();
    }
}
