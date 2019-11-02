package com.data.structure.sort;

public class InsertSort {
    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        int j;
        // 从下标为 1 的元素开始选择合适的位置插入，因为下标为 0 的只有一个元素，默认是有序的
        for (int i = 1; i < this.array.length; i++) {
            // 记录要插入的数据
            int tmp = this.array[i];
            j = i;
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            while (j > 0 && tmp < this.array[j - 1]) {
                // 依次右移一位
                this.array[j] = this.array[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            this.array[j] = tmp;
        }
        return this.array;
    }
}
