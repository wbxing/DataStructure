package com.test;

import com.data.structure.OrderLinkedList;

public class OrderLinkedListTest {
    public static void main(String[] args) {
        OrderLinkedList oll = new OrderLinkedList();
        oll.display();
        System.out.println(oll.isEmpty());
        oll.insert(1);
        oll.insert(2);
        oll.insert(5);
        oll.display();
        oll.insert(4);
        oll.display();
        oll.insert(3);
        oll.display();
        System.out.println(oll.isEmpty());

        oll.deleteHead();
        oll.display();
    }
}
