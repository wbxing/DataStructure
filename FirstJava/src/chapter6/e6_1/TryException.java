package chapter6.e6_1;

public class TryException {
    public static void main(String[] args) {
        System.out.println("1. 除法计算开始");
        try {
            System.out.println("2. 除法计算" + (10 / 0));
            System.out.println("---------------------");
        } catch (ArithmeticException e) {
            System.out.println("***** 出现异常 *****");
            e.printStackTrace();            // 输出异常完整信息
        } finally {
            System.out.println("####################");
        }
        System.out.println("3. 除法计算结束");
    }
}
