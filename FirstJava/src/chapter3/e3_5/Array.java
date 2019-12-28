package chapter3.e3_5;

public class Array {

    /**
     * 改变数组内容
     * @param temp 数组引用
     */
    public void change(int [] temp) {
        for (int x = 0; x < temp.length; ++x) {
            temp[x] *= 2;
        }
    }

    /**
     * 数组排序
     * @param temp 数组引用
     */
    public void sort(int [] temp) {
        for (int x : temp) {
            for (int y = 0; y < temp.length-1; ++y) {
                if (temp[y] > temp[y+1]) {
                    int t = temp[y];
                    temp[y] = temp[y+1];
                    temp[y+1] = t;
                }
            }
        }
    }

    /**
     * 数组输出
     * @param temp 引用数组
     */
    public void print(int [] temp) {
        for (int x : temp) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    public void print(int [][] temp) {
        for (int[] x : temp) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 数组转置
     * @param temp 数组引用
     */
    public void reverse(int [] temp) {
        int head = 0;                   // 头指针
        int tail = temp.length -1;      // 尾指针

        for (int i = 0; i < temp.length / 2; ++i) {
            int t = temp[head];
            temp[head++] = temp[tail];
            temp[tail--] = t;

        }
    }

    public void reverse(int [][] temp){
        for (int x = 0; x < temp.length; ++x) {
            for (int y = x; y < temp[x].length; ++y) {
                if (x != y) {
                    int t = temp[x][y];
                    temp[x][y] = temp[y][x];
                    temp[y][x] = t;
                }
            }
        }
    }

    public int [] init() {
        int random = (int) (Math.random() * 10);
        int [] result = new int[random];
        for (int x = 0; x < result.length; ++x) {
            result[x] = (int) (Math.random() * 10);
        }
        return result;
    }

}
