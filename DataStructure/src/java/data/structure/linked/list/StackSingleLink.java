package data.structure.linked.list;

/**
 * 单链表实现栈结构
 * 实现主要功能：
 * 压栈：push
 * 弹栈：pop
 * 判空：isEmpty
 * 打印栈内信息：display
 */
public class StackSingleLink {
    private SingleLinkedList stack;

    // 创建栈
    public StackSingleLink() {
        this.stack = new SingleLinkedList();
    }

    // 压栈，相当于头插法创建链表
    public void push(Object obj) {
        stack.addHead(obj);
    }

    // 弹栈，弹出栈顶元素
    public Object pop() {
        if (!this.stack.isEmpty()){
            return this.stack.deleteHead();
        }
        return "栈空";
    }

    // 判空
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    // 打印栈内信息
    public void display() {
        this.stack.display();
    }
}
