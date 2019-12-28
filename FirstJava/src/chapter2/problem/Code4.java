package chapter2.problem;

/**
 * 编写程序，分别利用while循环、do…while循环和for循环求出100~200的累加和
 */
public class Code4 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        while (num <= 200) {
            sum += num++;
        }
        System.out.println(sum);

        sum = 0;
        num = 100;
        do {
            sum += num++;
        } while (num <= 200);
        System.out.println(sum);

        sum = 0;
        for (num = 100; num <= 200; num++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
