package com.data.structure;

/**
 * 自定义数组
 */
public class MyArray {
    // 定义一个数组
    private int [] intArray;
    // 定义数组的有效长度
    private int element;
    // 定义数组的最大长度
    private int length;

    // 默认构造一个长度为 50 的数组
    public MyArray() {
        this(50);
    }

    // 初始化一个长度为 Length 的数组
    public MyArray(int length) {
        this.element = 0;
        this.length = length;
        this.intArray = new int[this.length];
    }

    // 获取数组长度
    public int getSize() {
        return this.element;
    }

    // 遍历显示元素
    public void display() {
        for (int i = 0; i < this.element; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * 添加元素
     * @param value 要添加的元素
     * @return 返回添加结果，添加成功返回 true, 添加失败返回 false
     */
    public boolean add(int value) {
        if (this.element >= this.length) {
            return false;
        } else {
            intArray[element++] = value;
        }
        return true;
    }

    /**
     * 查找指定下标的元素
     * @param index 元素下标
     * @return 返回指定下标的元素，如果越界会提示并返回 -1
     */
    public int get(int index) {
        if (index < 0 || index > this.length) {
            System.out.println("数组访问下标越界");
            return -1;
        }
        return intArray[index];
    }

    /**
     * 查找指定元素的下标
     * @param searchValue 需要查找的值
     * @return 返回指定元素下标，相同元素返回第一个的下标
     */
    public int find(int searchValue) {
        int index;
        for (index = 0; index < this.element; index++) {
            if (this.intArray[index] == searchValue) {
                break;
            }
        }
        if (index == this.element) {
            return -1;
        }
        return index;
    }

    /**
     * 删除指定元素，如果重复值只删除第一个
     * @param deleteValue 需要删除的值
     * @return 删除结果，不存在就返回 -1
     */
    public boolean delete(int deleteValue) {
        // 取得元素下标
        int index = this.find(deleteValue);

        if (index == -1) {
            // 元素不存在
            return false;
        } else {
            // 元素是最后一个
            if (index == this.element - 1) {
                this.element--;
            } else {
                if (this.element - 1 - index >= 0) {
                    System.arraycopy(intArray, index + 1, intArray, index, this.element - 1 - index);
                }
                this.element --;
            }
            return true;
        }
    }

    /**
     * 修改元素
     * @param oldValue 修改前的元素
     * @param newValue 修改后的元素
     * @return 返回修改结果，修改成功返回 true, 修改失败返回 false
     */
    public boolean modify(int oldValue, int newValue) {
        // 取得元素下标
        int index = this.find(oldValue);
        if (index == -1) {
            System.out.println("需要修改的数据不存在");
            return false;
        }else{
            intArray[index] = newValue;
            return true;
        }
    }

}
