package chapter_10;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.round(42.2));
        System.out.println(Math.round(56.12));
        System.out.println(Math.round(-343));

        // 返回介于 0.0 - 1.0 之间的双精度浮点数
        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // 返回绝对值
        int x = Math.abs(-246);
        double d = Math.abs(20.45);
        System.out.println("x = " + x);
        System.out.println("d = " + d);

        // 返回较小值
        System.out.println(Math.min(24, 240));

        // 返回较大值
        System.out.println(Math.max(24, 240));
    }
}
