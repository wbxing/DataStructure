package java.com.data.structure.sort;

public class ChoiceSort {
    public static void sort(int[] array){
        for(int i = 0 ; i < array.length - 1 ; i++){
            int min = i;
            for(int j = i + 1 ; j < array.length ; j++){
                if(array[j] < array[min]){
                    // 记录数值最小的数的下标
                    min = j;
                }
            }
            // 交换
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            //这里可以查看排序的中间结果
            System.out.print("第"+(i + 1)+"轮排序后的结果为:");
            BubbleSort.display(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 7, 9, 6, 8, 5, 2, 4};
        System.out.print("未排序的数组：");
        BubbleSort.display(array);
        System.out.println("排序：");
        sort(array);
        BubbleSort.display(array);
    }

}
