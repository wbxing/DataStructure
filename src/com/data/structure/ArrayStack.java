package com.data.structure;

public class ArrayStack {
    // 存储栈内元素的数组
    private Object [] elementData;
    // 栈顶指针
    private int top;
    // 栈的总容量
    private int size;

    public ArrayStack(int size) {
        if (size <= 0) {
            System.out.println("初始容量必须大于 0 ！");
        }
        this.size = size;
        this.top = -1;
        this.elementData = new Object[this.size];
    }
    // 默认构造容量为 10 的栈
    public ArrayStack() {
        this(10);
    }



}
