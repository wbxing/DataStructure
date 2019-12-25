package data.structure.linked.list;

/**
 * 双端链表实现队列
 * 实现功能
 * 入队：push
 * 出队：pop
 * 判空：isEmpty
 * 队列长度：getSize
 * 打印队列：display
 */
public class QueueLinkedList {
    private DoublePointLinkedList dp;

    public QueueLinkedList() {
        this.dp = new DoublePointLinkedList();
    }

    // 尾插法入队
    public void push(Object obj) {
        this.dp.add(obj, "tail");
    }

    public Object pop() {
        return this.dp.deleteHead();
    }

    public boolean isEmpty() {
        return this.dp.isEmpty();
    }

    public int getSize() {
        return this.dp.getSize();
    }

    public void display() {
        this.dp.display();
    }
}
