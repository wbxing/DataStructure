package chapter4.test;

import chapter4.e4_3.ReverseArray;

public class TestArray {
    public static void main(String[] args) {
        // Array array = new Array(5);
        // SortArray array = new SortArray(5);
        ReverseArray array = new ReverseArray(5);
        int [] data;
        array.add(10);
        array.add(13);
        array.add(2);
        array.add(143);
        array.add(14);
        data = array.getData();
        for (int d : data) {
            System.out.println(d);
        }
    }
}
