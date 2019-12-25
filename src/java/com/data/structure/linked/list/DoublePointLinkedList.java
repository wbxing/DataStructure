package java.com.data.structure.linked.list;

/**
 * 双端链表
 */
public class DoublePointLinkedList {
    // 头节点
    private Node head;
    // 尾节点
    private Node tail;
    private int size;

    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }
    }

    public DoublePointLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object obj, String mode) {
        Node newNode = new Node(obj);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            switch (mode) {
                case "head":
                    newNode.next = this.head;
                    this.head = newNode;
                    break;
                case "tail":
                    this.tail.next = newNode;
                    this.tail = newNode;
                    break;
            }
        }
        this.size ++;
    }

    // 默认使用头插法
    public void add(Object obj) {
        this.add(obj, "head");
    }

    // 删除头部节点
    public Object deleteHead() {
        // 无节点
        if (this.size == 0) {
            return null;
        }
        Object headNode = this.head;
        // 单节点
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            // 非单节点
            this.head = this.head.next;
        }
        this.size --;
        return headNode;
    }

    // 判空
    public boolean isEmpty() {
        return (this.size == 0);
    }

    // 获取链表长度
    public int getSize() {
        return this.size;
    }

    // 打印节点信息
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
                    System.out.println(current.data + " -> null ]");
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
