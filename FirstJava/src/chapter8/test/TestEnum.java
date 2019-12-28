package chapter8.test;

import chapter8.e8_5.*;

public class TestEnum {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red);

        for (Color c : Color.values()) {
            System.out.println(c.ordinal() + ": " + c);
        }

        // 枚举实现接口
        IMessage msg1 = ColorImpl1.RED;
        System.out.println(msg1.getTitle());

        IMessage msg2 = ColorImpl2.RED;
        System.out.println(msg2.getTitle());

        // 定义抽象方法
        System.out.println(AbstractColor.GREEN.getTitle());

        // 枚举的应用
        // switch
        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("This is red.");
                break;
            case GREEN:
                System.out.println("This is green.");
                break;
            case BLUE:
                System.out.println("This is blue.");
                break;
        }

        // 类结构中使用枚举
        System.out.println(new Member("zhang", 25, Sex.MALE));
    }
}
