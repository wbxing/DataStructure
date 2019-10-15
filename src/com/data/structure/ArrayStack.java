package com.data.structure;

import java.util.Arrays;

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
    // 默认构造容量为 5 的栈
    public ArrayStack() {
        this(5);
    }

    // 压栈
    public void push(Object element) {
        // 判断是否需要扩容
        boolean flag = isGrow(this.top + 1);
        // 压入元素
        this.elementData[++this.top] = element;
    }

    // 获取栈顶元素
    public Object peek() {
        if (top > -1) {
            return this.elementData[this.top];
        }
        System.out.println("空栈");
        return null;
    }

    // 弹栈
    public Object pop() {
        Object element = peek();
        if (element != null) {
            this.elementData[this.top] = null;
            this.top --;
        }
        return element;
    }

    // 判断栈空
    public boolean isEmpty() {
        return this.top == -1;
    }

    /**
     * 判断栈是否需要扩容
     * @param minCapacity 当前的栈的元素个数
     * @return 扩容结果
     */
    public boolean isGrow(int minCapacity) {
        // 定义扩大后栈的总容量
        int newCapacity;
        // 原先栈的容量
        int oldCapacity = this.size;
        // 判断是否需要扩容
        if (minCapacity >= oldCapacity) {
            // 容量扩大两倍，但是检查是否超过 int 的范围
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (oldCapacity << 1);
            }
            this.size = newCapacity;
            this.elementData = Arrays.copyOf(elementData, this.size);
            return true;
        }
        return false;
    }

}

