package chapter2.problem;

import java.util.Scanner;

/**
 * 通过代码完成两个整数内容的交换
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("m1");
        m1(x, y);
        System.out.println("\nm2");
        m2(x, y);
    }

    private static void m1(int x, int y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("SWAP");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    private static void m2(int x, int y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("SWAP");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
