package chapter10.e10_3;

public class TestSystem {
    public static void main(String[] args) {
        // 统计操作时间
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 5000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
