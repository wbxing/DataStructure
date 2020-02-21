package interview.code;

import java.math.BigDecimal;

/**
 * 使用 double 传参的时候会产生不可预期的结果
 * 使用字符串传参的时候会产生预期的结果
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0.1);
        System.out.println(a);
        BigDecimal b = new BigDecimal("0.1");
        System.out.println(b);
    }
}
