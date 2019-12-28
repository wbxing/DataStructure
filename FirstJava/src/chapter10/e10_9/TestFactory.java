package chapter10.e10_9;

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("** 吃苹果");
    }
}

class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("** 吃橘子");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}

public class TestFactory {
    public static void main(String[] args) {
        // 此时即便增加水果接口的实现类，也不需要在修改工厂类
        // 直接传递类名称
        Fruit fruitA = Factory.getInstance("chapter10.e10_9.Apple");
        Fruit fruitB = Factory.getInstance("chapter10.e10_9.Orange");
        fruitA.eat();
        fruitB.eat();
    }
}
