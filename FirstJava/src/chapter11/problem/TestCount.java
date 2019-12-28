package chapter11.problem;

import java.util.Scanner;

/**
 *  根据屏幕提示输入一个数字字符串
 *  输入后统计有多少个偶数数字和奇数数字
 */
public class TestCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers;
        String regex = "\\d+";
        boolean flag = false;
        scanner.useDelimiter("\n");
        while (!flag) {
            System.out.println("请输入一串整数：");
            if (scanner.hasNext()) {
                numbers = scanner.next().trim();
                if (!numbers.matches(regex)) {
                    System.out.println("输入有误，请重新输入");
                } else {
                    flag = true;
                    count(numbers);
                }
            }
        }
    }

    private static void count(String num) {
        int oddCount = 0;
        int evenCount = 0;
        String[] nums = num.split("");
        for (String n : nums) {
            int i = Integer.parseInt(n);
            if ((i & 1) == 1) {
                oddCount ++;
            } else {
                evenCount ++;
            }
        }
        System.out.println("奇数个数：" + oddCount);
        System.out.println("偶数个数：" + evenCount);
    }
}
