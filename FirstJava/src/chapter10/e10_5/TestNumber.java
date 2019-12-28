package chapter10.e10_5;

import java.util.Random;

public class TestNumber {
    public static void main(String[] args) {
        // Math
        // 四舍五入
        System.out.println(Math.round(15.5));
        System.out.println(Math.round(-15.5));
        System.out.println(Math.round(-15.51));

        System.out.println(round(15.678139, 2));

        // Random
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();

        // 36 选 7
        random = new Random();
        int [] data = new int[7];
        int foot = 0;
        while (foot < 7) {
            int t = random.nextInt(37);
            if (!isRepeat(data, t)) {
                data[foot++] = t;
            }
        }
        java.util.Arrays.sort(data);
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 超过 double 的范围 : Infinity
        System.out.println(Double.MAX_VALUE * Double.MAX_VALUE);

        // 利用BigDecimal 类实现准确的四舍五入操作
        System.out.println(MyMath.round(19.291471835674813265921, 2));
        System.out.println(MyMath.round(-15.5, 0));
        System.out.println(MyMath.round(15.5, 0));

    }

    private static double round(double num, int scale) {
        return Math.round(num * Math.pow(10.0, scale) / Math.pow(10.0, scale));
    }

    private static boolean isRepeat(int[] temp, int num) {
        if (num == 0) {
            return true;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == num) {
                return true;
            }
        }
        return false;
    }
}
