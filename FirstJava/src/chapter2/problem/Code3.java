package chapter2.problem;

import java.util.Scanner;

/**
 * 判断某数能否被3，5，7同时整除
 */

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num % 3 == 0) && (num % 5 == 0) && (num % 7 == 0)) {
            System.out.println(num + " is OK.");
        } else {
            System.out.println(num + " isn't OK.");
        }
    }
}
