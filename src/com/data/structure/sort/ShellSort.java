package com.data.structure.sort;

import java.util.Arrays;

public class ShellSort {
    private int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    // 希尔排序 knuth 间隔序列 3h+1
    public void shellKnuthSort() {
        System.out.println("原数组为" + Arrays.toString(this.array));
        int step = 1;
        int len = this.array.length;
        // 设置间隔
        while (step <= len / 3) {
            step = step * 3 + 1;
        }
        while (step > 0) {
            // 分别对每个增量间隔进行排序
            for (int i = step; i < len; i++) {
                int temp = this.array[i];
                int j = i;
                while (j > step - 1 && temp <= this.array[j - step]) {
                    this.array[j] = this.array[j - step];
                    j -= step;
                }
                this.array[j] = temp;
            }
            System.out.println("间隔为" + step + "的排序结果为" + Arrays.toString(this.array));
            step = (step - 1) / 3;
        }
        System.out.println("最终排序：" + Arrays.toString(this.array));
    }
}
