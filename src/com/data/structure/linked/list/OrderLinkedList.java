package com.data.structure.linked.list;

/**
 * 有序链表
 * 链表元素在插入时进行排序
 */
public class OrderLinkedList {
    private Node head;

    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public OrderLinkedList(){
        this.head = null;
    }

    // 插入数据，链表按照从小到大的顺序排列
    public void insert(int value) {
        Node node = new Node(value);
        Node previous = null;
        Node current = this.head;
        // 寻找插入位置
        while (current != null && value > current.data) {
            previous = current;
            current = current.next;
        }
        // 此时 previous 表示插入位置的前一个节点
        // 插入节点
        if (previous == null) {
            this.head = node;
        } else {
            previous.next = node;
            node.next = current;
        }
    }

    // 删除头节点
    public Object deleteHead() {
        if (this.head == null) {
            return null;
        }
        Object obj = this.head;
        this.head = this.head.next;
        return obj;
    }

    // 判空
    public boolean isEmpty() {
        return (this.head == null);
    }

    // 打印信息
    public void display() {
        if (this.head == null) {
            System.out.println("[ null ]");
        } else {
            Node current = this.head;
            System.out.print("[ ");
            while (current != null) {
                // 当前节点是最后一个节点
                if (current.next == null) {
                    System.out.println(current.data + " -> null ]");
                } else {
                    // 当前节点不是最后一个节点
                    System.out.print(current.data + " -> ");
                }
                current = current.next;
            }
        }
    }
}
