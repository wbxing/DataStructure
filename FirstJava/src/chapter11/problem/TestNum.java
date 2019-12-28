package chapter11.problem;

import java.util.Scanner;

/**
 * 编写Java程序，输入3个整数，并求出三个整数的最大值、最小值
 */
public class TestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int[] data = new int[3];
        int count = 0;
        while (count++ < 3) {
            System.out.print("请输入第" + (count) + "个整数：");
            if (scanner.hasNextInt()) {
                data[count-1] = scanner.nextInt();
            } else {
                System.out.println("输入的不是整数，请重新输入");
                scanner.next();
                count --;
            }
        }

        int max = data[0];
        int min = data[0];
        for (int i : data) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }

        System.out.println("最大数：" + max);
        System.out.println("最小数：" + min);
    }
}
