package test;

import java.com.data.structure.linked.list.DoublePointLinkedList;

public class DoublePointLinkedListTest {
    public static void main(String[] args) {
        DoublePointLinkedList dpl = new DoublePointLinkedList();
        // 打印空链表
        dpl.display();
        // 头插法, 默认添加方法
        dpl.add("B");
        dpl.display();

        dpl.add("A");
        dpl.display();

        // 尾插法
        dpl.add("C", "tail");
        dpl.display();

        dpl.add("D", "tail");
        dpl.display();

        // 删除头节点
        System.out.println(dpl.deleteHead());
        dpl.display();
    }
}
