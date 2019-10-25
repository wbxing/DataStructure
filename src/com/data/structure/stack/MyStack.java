package com.data.structure.stack;

/**
 * 自定义简单栈
 * 主要功能包括：
 * 压栈
 * 弹栈
 * 判断栈空
 * 判断栈满
 * 打印栈内元素
 */
public class MyStack {
    // 数组模拟栈
    private int [] array;
    // 栈的最大深度
    private int maxSize;
    // 栈顶位置
    private int top;

    // 提供自定义深度的构造方法
    public MyStack(int maxSize) {
        // 下标从 0 开始
        this.maxSize = maxSize - 1;
        this.array = new int[maxSize];
        this.top = -1;
    }
    // 默认构造一个深度为50的栈
    public MyStack() {
        this(50);
    }

    // 压栈
    public void push(int value) {
        if (this.top < this.maxSize) {
            this.array[++this.top] = value;
        }
    }

    // 弹栈
    public int pop() {
        return this.array[top--];
    }
    // 仅仅访问不弹栈
    public int peek() {
        return this.array[top];
    }

    // 判空
    public boolean isEmpty() {
        return (this.top == -1);
    }

    // 判满
    public boolean isFull() {
        return (this.top == this.maxSize);
    }

    // 打印栈内元素
    public void display() {
        for (int i = this.array.length; i>0; i--) {
            System.out.println(this.array[i-1]);
        }
    }
}
