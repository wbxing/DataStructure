package com.data.structure;

/**
 * 单向链表的实现
 */
public class SingleLinkedList {
    // 头节点
    private Node head;
    // 链表长度
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // 内部类表示每一个节点
    private class Node{
        // 节点数据
        private Object data;
        // 指向下一个节点的连接
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    // 头插法添加链表元素
    public void addHead(Object obj) {
        Node newNode = new Node(obj);
        if (this.size == 0) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size ++;
    }

    // 尾插法添加链表元素
    public void addTail(Object obj) {
        Node newNode = new Node(obj);
        if (this.size == 0) {
            this.head = newNode;
        } else {
            Node current = this.head;
            // 遍历到链表尾部
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size ++;
    }

    // 删除表头元素
    public Object deleteHead() {
        Object obj = this.head;
        this.head = this.head.next;
        this.size --;
        return obj;
    }

    // 查找指定元素，找到返回该节点，找不到返回 null
    public Object find(Object obj) {
        if (this.size == 0 || obj == null) {
            return null;
        }
        // 当前节点
        Node current = this.head;
        // 链表长度
        int findSize = this.size;
        while (findSize > 0) {
            if (current.data.equals(obj)) {
                return current;
            } else {
                current = current.next;
            }
            findSize --;
        }
        return null;
    }

    // 删除指定元素，删除成功返回 true， 否则返回 false
    public boolean delete(Object obj) {
        if (this.size == 0 || obj == null) {
            return false;
        }
        // 当前节点
        Node current = this.head;
        // 前一节点
        Node previous = current;
        // 找出需要删除的节点
        while (!(current.data.equals(obj))) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }
        // 删除的是头节点
        if (current.equals(this.head)) {
            deleteHead();
        } else {
            // 删除的不是头节点
            previous.next = current.next;
            this.size --;
        }
        return true;
    }

    // 判断链表是否为空
    public boolean isEmpty() {
        return (this.size == 0);
    }

    // 显示节点信息
    public void display() {
        if (this.size == 0) {
            System.out.println("[ null ]");
        } else {
            Node current = this.head;
            int tempSize = this.size;
            System.out.print("[ ");
            while (tempSize > 0) {
                // 当前节点是最后一个节点
                if (current.next == null) {
                    System.out.println(current.data + " ]");
                } else {
                    // 当前节点不是最后一个节点
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                tempSize --;
            }
        }
    }
}
