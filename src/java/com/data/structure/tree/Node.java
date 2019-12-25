package java.com.data.structure.tree;

/**
 * 树的节点
 */
public class Node {
    // 节点数据
    private int data;
    // 左子节点
    private Node leftChildNode;
    // 右子节点
    private Node rightChildNode;
    // 标记节点是否被删除
    private boolean isDelete;

    public Node(int data) {
        this.data = data;
    }

    // 输出节点
    public void display() {
        System.out.print(this.data + "  ");
    }

    public int getData() {
        return this.data;
    }

    public Node getLeftChildNode() {
        return this.leftChildNode;
    }

    public Node getRightChildNode() {
        return this.rightChildNode;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChildNode(Node leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public void setRightChildNode(Node rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
