package chapter10.e10_5;

import java.math.BigDecimal;

public class MyMath {
    /**
     * 实现准确位数的四舍五入操作
     * @param num 要进行四舍五入的数字
     * @param scale 需要保留的位数
     * @return 处理后的四舍五入数据
     */
    public static double round(double num, int scale) {
        BigDecimal big = new BigDecimal(num);
        BigDecimal result = big.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
        return result.doubleValue();
    }
}
