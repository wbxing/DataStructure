package com.data.structure.tree.redblack;

public class RBNode<T extends Comparable<T>> {
    public static final boolean RED = true;
    public static final boolean BLACK = false;

    // 节点颜色
    private boolean color;
    // 关键值
    private T key;
    // 左子节点
    private RBNode<T> left;
    // 右子节点
    private RBNode<T> right;
    // 父节点
    private RBNode<T> parent;

    public RBNode(boolean color, T key, RBNode<T> left, RBNode<T> right, RBNode<T> parent) {
        this.color = color;
        this.key = key;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public String getColor() {
        return this.color == RED ? "R" : "B";
    }

    public T getKey() {
        return this.key;
    }

    public RBNode<T> getLeft() {
        return this.left;
    }

    public RBNode<T> getRight() {
        return this.right;
    }

    public RBNode<T> getParent() {
        return this.parent;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setLeft(RBNode<T> left) {
        this.left = left;
    }

    public void setRight(RBNode<T> right) {
        this.right = right;
    }

    public void setParent(RBNode<T> parent) {
        this.parent = parent;
    }

    // 打印节点关键值和颜色信息
    public String toString() {
        return this.key + (this.color == RED ? "R" : "B");
    }
}
