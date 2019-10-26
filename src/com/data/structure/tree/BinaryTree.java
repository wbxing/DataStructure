package com.data.structure.tree;

public class BinaryTree implements Tree {
    // 根节点
    private Node root;

    public Node getRoot() {
        return root;
    }

    @Override
    // 查找节点
    public Node find(int key) {
        Node current = this.root;
        // 循环查找
        while (current != null) {
            // 当前值比查找值小，查找左子树
            if (current.getData() > key) {
                current = current.getLeftChildNode();
            } else if (current.getData() < key) { // // 当前值比查找值大，查找右子树
                current = current.getRightChildNode();
            } else {
                return current;
            }
        }
        // 未找到
        return null;
    }

    @Override
    // 插入节点
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (this.root == null) { // 空树
            this.root = newNode;
            return true;
        } else {
            Node current = this.root;
            Node parent;
            // 查找插入位置
            while (true) {
                parent = current;
                // // 当前值比查找值小，查找左子树
                if (current.getData() > data) {
                    current = current.getLeftChildNode();
                    // 左子树为空
                    if (current == null) {
                        parent.setLeftChildNode(newNode);
                        return true;
                    }
                } else { // 当前值比查找值大，查找右子树
                    current = current.getRightChildNode();
                    // 右子树为空
                    if (current == null) {
                        parent.setRightChildNode(newNode);
                        return true;
                    }
                }
            }
        }
    }

    @Override
    // 删除节点
    public boolean delete(int key) {
        Node current = this.root;
        Node parent = current;
        boolean isLeftChild = false;
        //查找删除值，找不到直接返回 false
        while(current.getData() != key){
            parent = current;
            if(current.getData() > key){
                isLeftChild = true;
                current = current.getLeftChildNode();
            }else {
                isLeftChild = false;
                current = current.getRightChildNode();
            }
            if(current == null) {
                return false;
            }
        }

        //如果当前节点没有子节点
        if(current.getLeftChildNode() == null && current.getRightChildNode() == null) {
            if (current == this.root) {
                this.root = null;
            } else if (isLeftChild) {
                parent.setLeftChildNode(null);
            } else {
                parent.setRightChildNode(null);
            }
            return true;
        } else if (current.getLeftChildNode() == null && current.getRightChildNode() != null) { // 有右子节点
            if (current == this.root) {
                this.root = current.getLeftChildNode();
            } else if(isLeftChild) {
                parent.setLeftChildNode(current.getRightChildNode());
            }else {
                parent.setRightChildNode(current.getRightChildNode());
            }
            return true;
        } else if (current.getLeftChildNode() != null && current.getRightChildNode() == null) { // 有左子节点
            if(current == this.root){
                this.root = current.getLeftChildNode();
            } else if(isLeftChild) {
                parent.setLeftChildNode(current.getLeftChildNode());
            } else {
                parent.setRightChildNode(current.getLeftChildNode());
            }
            return true;
        } else { // 有左右子节点
            Node successor = getSuccessor(current);
            if (current == this.root) {
                this.root= successor;
            } else if (isLeftChild) {
                parent.setLeftChildNode(successor);
            } else {
                parent.setRightChildNode(successor);
            }
            successor.setLeftChildNode(current.getLeftChildNode());
        }
        return false;
    }

    // 获取后继节点
    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightChildNode();
        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftChildNode();
        }
        //后继节点不是删除节点的右子节点，将后继节点替换删除节点
        if(successor != delNode.getRightChildNode()){
            successorParent.setLeftChildNode(successor.getRightChildNode());
            successor.setRightChildNode(delNode.getRightChildNode());
        }
        return successor;
    }

    @Override
    // 中序遍历
    public void infixOrder(Node current) {
        if (current != null) {
            // 遍历左子树
            infixOrder(current.getLeftChildNode());
            // 输出节点信息
            current.display();
            // 遍历右子树
            infixOrder(current.getRightChildNode());
        }
    }

    @Override
    public void preOrder(Node current) {
        if (current != null) {
            // 输出节点信息
            current.display();
            // 遍历左子树
            preOrder(current.getLeftChildNode());
            // 遍历右子树
            preOrder(current.getRightChildNode());
        }
    }

    @Override
    // 后序遍历
    public void postOrder(Node current) {
        if (current != null) {
            // 遍历左子树
            postOrder(current.getLeftChildNode());
            // 遍历右子树
            postOrder(current.getRightChildNode());
            // 输出节点信息
            current.display();
        }
    }

    @Override
    // 查找最大值，最右节点
    public Node findMax() {
        Node current = this.root;
        Node maxNode = current;
        while (current != null) {
            maxNode = current;
            current = current.getRightChildNode();
        }
        return maxNode;
    }

    @Override
    // 查找最小值，最左节点
    public Node findMin() {
        Node current = this.root;
        Node minNode = current;
        while (current != null) {
            minNode = current;
            current = current.getLeftChildNode();
        }
        return minNode;
    }
}
