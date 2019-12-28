package chapter3.test;

import chapter3.e3_5.Array;
import chapter3.e3_2.NewBook;
import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        Array array = new Array();

        int data [] = new int[3];
//        int [] data = null;
//        data = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        array.print(data);

        // 数组的引用传递
        int [] temp = data;
        temp[0] = 99;
        array.print(data);

        // 静态初始化
        data = new int[] {1, 2, 3, 4, 5};
        array.print(data);

        // 二维数组
        int [][] dataArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        array.print(dataArray);

        // 数组的传递
        data = new int[] {1, 2, 3};
        array.change(data);
        array.print(data);

        // 数组排序
        data = new int[] {2, 1, 9, 0, 5, 3, 8, 7, 6};
        array.sort(data);
        array.print(data);

        // 数组转置
        array.print(data);
        array.reverse(data);
        array.print(data);
        array.print(dataArray);
        array.reverse(dataArray);
        array.print(dataArray);

        // 方法返回数组
        data = array.init();
        array.print(data);
        System.out.println("数组长度：" + data.length);

        // 数组操作方法
        // 数组复制
        int [] dataA = new int [] {1, 2, 3, 4, 5, 6, 7, 8};
        int [] dataB = new int [] {11, 22, 33, 44, 55, 66, 77, 88};
        System.arraycopy(dataA, 4, dataB, 3, 3);
        array.print(dataB);
        // 数组排序
        data = new int[] {3, 6, 1, 2, 8, 0};
        Arrays.sort(data);
        array.print(data);
        // 对象数组
        NewBook [] book = new NewBook[3];
        book[0] = new NewBook("Java", 79.8);
        book[1] = new NewBook("JSP", 69.8);
        book[2] = new NewBook("Android", 89.8);
        for (NewBook bk : book) {
            bk.getInfo();
        }


    }

}
