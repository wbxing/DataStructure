package java.com.data.structure.sort;

public class BubbleSort {
    public static void sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 设置交换标记
            boolean flag = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            // 此处可以展示每一轮的中间结果
            System.out.print("第" + (i + 1) + "轮的结果：");
            display(array);
        }
    }

    public static void display(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 6, 8, 5, 2, 4};
        System.out.print("未排序的数组：");
        display(array);
        System.out.println("排序：");
        sort(array);
        display(array);
    }
}
