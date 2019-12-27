package com.data.structure.hash;

/**
 * 有序链表
 */
public class OrderLinkedList {
    private DataItem first;

    public OrderLinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insert(DataItem node) {
        int key = node.getKey();
        DataItem previous = null;
        DataItem current = this.first;
        while (current != null && current.getKey() < key) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            this.first = node;
        } else {
            previous.next = node;
        }
        node.next = current;
    }

    public void delete(int key) {
        DataItem previous = null;
        DataItem current = this.first;
        if (isEmpty()) {
            System.out.println("Linked is Empty!!!");
            return;
        }
        while (current != null && current.getKey() != key) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            this.first = first.next;
        } else {
            assert current != null;
            previous.next = current.next;
        }
    }

    public DataItem find(int key) {
        DataItem current = first;
        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        System.out.println("Link(First->Last)");
        DataItem current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
