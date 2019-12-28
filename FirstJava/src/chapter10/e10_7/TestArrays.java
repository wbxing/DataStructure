package chapter10.e10_7;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        // 二分查找
        int[] data = new int[] {1, 5, 6, 2, 3, 9, 4, 8, 7, 10};
        java.util.Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data, 9));

        //数组相等比较
        int[] dataA = new int[] {1, 2, 3};
        int[] dataB = new int[] {1, 2, 3};
        System.out.println(Arrays.equals(dataA, dataB));

        // 数组填充
        data = new int[10];
        Arrays.fill(data, 3);
        System.out.println(Arrays.toString(data));

    }
}
