package chapter6.e6_5;

public class DealException {
    public static int div(int x, int y) throws Exception {
        System.out.println("====== 计算开始 =====");
        int result = 0;
        try {
            result = x / y;
        } finally {
            System.out.println("===== 计算结束 =====");
        }
        return result;
    }
}
