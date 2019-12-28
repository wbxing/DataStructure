package chapter2.problem;

/**
 * 打印出100~1000范围内的所有 “水仙花数”
 * “水仙花数”是指一个三位数，其各位数字立方和等于该数本身
 * 例如：153是一个“水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方
 */
public class Code1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int sum;
        for (int x = 100; x < 1000; ++x) {
            // 计算百位数字
            num1 = x / 100;
            // 计算十位数字
            num2 = (x / 10) % 10;
            // 计算个位数字
            num3 = x % 10;
            //计算立方和
            sum = (int)(Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3));
            if (x == sum) {
                System.out.print(x + "\t");
            }
        }
    }
}