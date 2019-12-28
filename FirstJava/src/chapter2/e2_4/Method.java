package chapter2.e2_4;

public class Method {
    public static void main(String[] args) {
        printInfo();
        printInfo();

        pay(10);
        pay(-10);

        int result;
        result = add(10, 20);
        System.out.println("相加结果: " + result) ;

        set(100);
        set(3);
        set(10);

        System.out.println("两个整型参数的和：10+20=" + add(10, 20));
        System.out.println("三个整型参数的和：10+20+30=" + add(10, 20, 30));
        System.out.println("两个浮点型参数的和：10.0+20.1=" + add(10.0, 20.1));

        System.out.println(sum(100));
    }

    private static void printInfo() {
        System.out.println("*******");
        System.out.println("*Hello*");
        System.out.println("*******");
    }

    /**
     * 定义一个支付的操作方法
     * @param money 要支付的金额
     */
    private static void pay(double money) {
        if (money > 0.0) {
            System.out.println("OK");
        } else {
            System.out.println("No");
        }
    }

    /**
     * 实现两个整型数的加法操作
     * @param x 操作数一
     * @param y 操作数二
     * @return 返回两个数的和
     */
    private static int add(int x, int y) {
        return x + y;
    }

    /**
     * 实现三个整型数的加法操作
     * @param x 操作数一
     * @param y 操作数二
     * @param z 操作数三
     * @return 返回三个数的和
     */
    private static int add(int x, int y, int z) {
        return x + y + z;
    }

    /**
     * 实现两个浮点型数的加法操作
     * @param x 操作数一
     * @param y 操作数二
     * @return 返回两个数的和
     */
    private static double add(double x, double y) {
        return x + y;
    }

    /**
     * 设置方法，如果参数是3则不能设置
     * @param x 要设置的值
     */
    private static void set(int x) {
        if (x == 3) {
            return;
        }
        System.out.println("x = " + x);
    }

    /**
     * 数据的累加操作
     * @param num 要进行累加的数
     * @return 累加的结果
     */
    private static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num -1);
    }
}
