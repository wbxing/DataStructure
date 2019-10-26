package com.data.structure.tree;

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
        System.out.println(this.data);
    }

    public int getData() {
        return data;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }

    public boolean isDelete() {
        return isDelete;
    }
}
