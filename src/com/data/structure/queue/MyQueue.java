package com.data.structure.queue;

/**
 * 简单队列
 */
public class MyQueue {
    // 队列
    private Object [] queue;
    // 队头
    private int front;
    // 队尾
    private int rear;
    // 队列总大小
    private int size;
    // 队列中实际元素数目
    private int realSize;

    public MyQueue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = -1;
        this.realSize = 0;
        this.queue = new Object[this.size];
    }

    // 默认构造大小为 5 的队列

    public MyQueue() {
        this(5);
    }

    // 入队
    public void push(Object element) {
        if (this.isFull()) {
            System.out.println("队列已满");
        } else {
            // 循环
            if (this.rear == this.size -1) {
                this.rear = -1;
            }
            // 入队
            this.queue[++rear] = element;
            this.realSize ++;
        }
    }

    // 出队
    public Object pop() {
        if(!isEmpty()){
            Object removeValue = this.queue[this.front];
            this.queue[this.front++] = null;
            // 循环
            if(this.front == this.size){
                this.front = 0;
            }
            this.realSize --;
            return removeValue;
        }
        System.out.println("空队列");
        return null;
    }

    //查看对头数据
    public Object peek(){
        return this.queue[this.front];
    }

    // 队列长度
    public int getRealSize() {
        return this.realSize;
    }

    // 判断队满
    public boolean isFull() {
        return this.size == this.realSize;
    }

    // 判断队空
    public boolean isEmpty() {
        return this.realSize == 0;
    }
}
