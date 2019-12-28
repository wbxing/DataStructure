package chapter10.problem;

import java.util.Arrays;
import java.util.Random;

/**
 * 利用Random类产生5个1~30之间（包括1和30）的随机整数
 */

public class TestRandom {
    public static void main(String[] args) {
        int[] num = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int temp = random.nextInt(31);
            if (!isRepeat(num, temp)) {
                num[i] = temp;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    private static boolean isRepeat(int[] temp, int num) {
        if (num == 0) {
            return true;
        }
        for (int value : temp)
            if (value == num) {
                return true;
            }
        return false;
    }
}
