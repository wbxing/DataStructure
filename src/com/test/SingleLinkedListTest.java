package com.test;

import com.data.structure.SingleLinkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList singleList = new SingleLinkedList();
        // 打印空链表
        singleList.display();
        // 头插法
        singleList.addHead("B");
        singleList.display();

        singleList.addHead("A");
        singleList.display();

        // 尾插法
        singleList.addTail("C");
        singleList.display();

        singleList.addTail("D");
        singleList.display();

        //删除
        System.out.println(singleList.delete("D"));
        singleList.display();
        //查找
        System.out.println(singleList.find("D"));
        // 删除头节点
        System.out.println(singleList.deleteHead());
        singleList.display();
    }
}
