package com.data.structure.tree;

public interface Tree {
    // 查找节点
    Node find(int key);
    // 插入节点
    boolean insert(int data);
    // 删除节点
    boolean delete(int key);
    // 中序遍历
    void infixOrder(Node current);
    // 前序遍历
    void preOrder(Node current);
    // 后续遍历
    void postOrder(Node current);
    // 查找最大值
    Node findMax();
    // 查找最小值
    Node findMin();
}
