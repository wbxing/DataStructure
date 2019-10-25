package com.data.structure.linked.list;

/**
 * 双向链表
 */
public class TwoWayLinkedList {
    // 头节点
    private Node head;
    // 尾节点
    private Node tail;
    // 链表长度
    private int size;

    private class Node{
        private Object data;
        private Node next;
        private Node prev;
        public Node(Object data){
            this.data = data;
        }
    }

    public TwoWayLinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(Object value, String mode){
        Node newNode = new Node(value);
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
        } else {
            switch (mode) {
                case "head":
                    this.head.prev = newNode;
                    newNode.next = this.head;
                    this.head = newNode;
                    break;
                case "tail":
                    newNode.prev = this.tail;
                    this.tail.next = newNode;
                    this.tail = newNode;
                    break;
            }
        }
        this.size ++;
    }
    // 默认采用头插法
    public void add(Object value) {
        this.add(value, "head");
    }

    //删除链表头
    public Object deleteHead() {
        Object temp = this.head;
        if (this.size == 0) {
            return null;
        }
        this.head = this.head.next;
        this.head.prev = null;
        this.size--;

        return temp;
    }

    public Object deleteTail(){
        Object temp = this.tail;
        if (this.size == 0) {
            return null;
        }
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size --;
        return temp;
    }

    //获得链表的节点个数
    public int getSize(){
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return (size == 0);
    }

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
                    System.out.print(current.data + " <-> ");
                }
                current = current.next;
            }
        }
    }

}
