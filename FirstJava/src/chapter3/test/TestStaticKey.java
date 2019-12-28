package chapter3.test;

import chapter3.e3_10.StaticKey;

public class TestStaticKey {
    public static void main(String[] args) {
        StaticKey s1 = new StaticKey("123", 123);
        StaticKey s2 = new StaticKey("23", 23);
        StaticKey s3 = new StaticKey("1234", 1234);
        s1.pub = "123456789";

        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());

        System.out.println(StaticKey.pub);

        // static 定义方法
        StaticKey.setPub("1234ew");
        System.out.println(s1.getInfo());

        // 调用非 static 方法
        new TestStaticKey().fun();

        // static 方法，直接调用
        System.out.println(StaticKey.add(2, 3));

        // 实际应用 统计
        new StaticKey();
        new StaticKey();
        new StaticKey();
        new StaticKey();
        new StaticKey();
        new StaticKey();
        new StaticKey();
        new StaticKey();

        // 实际应用 默认命名
        System.out.println(new StaticKey("Java").getTitle());
        System.out.println(new StaticKey().getTitle());
        System.out.println(new StaticKey().getTitle());
    }

    // 主类中非 static 方法
    public void fun() {
        System.out.println("Hello World");
    }
}
