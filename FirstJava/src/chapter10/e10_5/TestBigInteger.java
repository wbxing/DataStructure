package chapter10.e10_5;

import java.math.BigInteger;
import static chapter10.e10_5.MyMath.round;

public class TestBigInteger {
    public static void main(String[] args) {
        // 大整数操作类
        BigInteger bigA = new BigInteger("234809234801");
        BigInteger bigB = new BigInteger("8939834789");

        System.out.println("加法：" + bigA.add(bigB));
        System.out.println("减法：" + bigA.subtract(bigB));
        System.out.println("乘法：" + bigA.multiply(bigB));
        System.out.println("除法：" + bigA.divide(bigB));

        BigInteger[] result = bigA.divideAndRemainder(bigB);
        System.out.println("商：" + result[0] + " 余数：" + result[1]);

        // 大小数操作类
        System.out.println(round(15.5, 0));
        System.out.println(round(-15.5, 0));
        System.out.println(round(168.98765, 2));
    }
}
