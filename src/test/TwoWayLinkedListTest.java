package test;

import java.com.data.structure.linked.list.TwoWayLinkedList;

public class TwoWayLinkedListTest {
    public static void main(String[] args) {
        TwoWayLinkedList twl = new TwoWayLinkedList();
        // 打印空链表
        twl.display();
        // 头插法
        twl.add("B");
        twl.display();

        twl.add("A");
        twl.display();

        // 尾插法
        twl.add("C", "tail");
        twl.display();

        twl.add("D", "tail");
        twl.display();

        //删除
        System.out.println(twl.deleteTail());
        twl.display();

        // 删除头节点
        System.out.println(twl.deleteHead());
        twl.display();
    }
}
