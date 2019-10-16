package com.test;

import com.data.structure.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(2);
        pq.insert(3);
        pq.insert(1);
        System.out.println(pq.peekMaxPriority());
        System.out.println(pq.remove());
    }
}
