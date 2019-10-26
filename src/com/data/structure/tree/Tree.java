package com.data.structure.tree;

public interface Tree {
    // 查找节点
    Node find();
    // 插入节点
    boolean insert();
    // 删除节点
    boolean delete();
    // 中序遍历
    void infixOrder();
    // 前序遍历
    void preOrder();
    // 后续遍历
    void postOrder();
    // 查找最大值
    Node findMax();
    // 查找最小值
    Node findMin();
}
