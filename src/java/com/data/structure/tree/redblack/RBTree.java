package java.com.data.structure.tree.redblack;

public class RBTree<T extends Comparable<T>> {
    // 根节点
    private RBNode<T> root;

    // 旋转
    public void rotate(RBNode<T> x, RBNode<T> y) {
        // 将 x 的父节点 p (非空时)赋给 y 的父节点，同时更新 p 的子节点为 y (左或右)
        y.setParent(x.getParent());
        if(x.getParent() == null){
            // 如果 x 的父节点为空(即 x 为根节点)，则将 y 设为根节点
            this.root = y;
        } else {
            // 如果 x 是左子节点，则也将 y 设为左子节点
            if (x == x.getParent().getLeft()) {
                x.getParent().setLeft(y);
            } else {
                x.getParent().setRight(y);
            }
        }
    }

    // 左旋
    public void leftRotate(RBNode<T> x) {
        // 首先将 y 的左子节点赋给 x 的右子节点，并将 x 赋给 y 左子节点的父节点( y 左子节点非空时)
        RBNode<T> y = x.getRight();
        x.setLeft(y.getLeft());
        if(y.getLeft() != null){
            y.getLeft().setParent(x);
        }
        this.rotate(x, y);
        y.setLeft(x);
        x.setParent(y);
    }

    // 右旋，与左旋对称
    public void rightRotate(RBNode<T> x) {
        RBNode<T> y = x.getLeft();
        x.setLeft(y.getRight());
        if (y.getRight() != null) {
            y.getRight().setParent(x);
        }
        this.rotate(x, y);
        x.setRight(y);
        y.setParent(x);
    }

    // 插入数据
    public void insert(T key) {
        RBNode<T> node = new RBNode<T>(RBNode.RED, key, null, null, null);
        if(node != null){
            insert(node);
        }
    }
    public void insert(RBNode<T> node) {
        // 表示 node 的父节点
        RBNode<T> current = null;
        // 用于向下搜索的指针
        RBNode<T> x = this.root;
        // 寻找插入位置
        while(x != null){
            current = x;
            int cmp = node.getKey().compareTo(x.getKey());
            if (cmp < 0) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        node.setParent(current);
        // 判断 node 是左子节点还是右子节点
        if(current != null){
            int cmp = node.getKey().compareTo(current.getKey());
            if (cmp < 0) {
                current.setLeft(node);
            } else {
                current.setRight(node);
            }
        } else {
            this.root = node;
        }
        // 旋转调整
        this.insertFixUp(node);
    }

    private void insertFixUp(RBNode<T> node) {
        // 定义父节点和祖父节点
        RBNode<T> parent, grandparent;
        // 需要修正的条件：父节点存在，且父节点的颜色是红色
        while (((parent = node.getParent()) != null) && isRed(parent)) {
            // 获取祖父节点
            grandparent = parent.getParent();
            // 若父节点是祖父节点的左子节点
            if (parent == grandparent.getLeft()) {
                // 获取父节点的兄弟节点
                RBNode<T> uncle = grandparent.getRight();
                // 叔叔节点是红色的
                if(uncle != null && isRed(uncle)){
                    // 把父节点和叔叔节点涂黑
                    parent.setColor(RBNode.BLACK);
                    uncle.setColor(RBNode.BLACK);
                    // 把祖父节点涂红
                    grandparent.setColor(RBNode.RED);
                    // 把位置放到祖父节点处，继续循环判断
                    node = grandparent;
                    continue;
                }
                // 叔叔节点是黑色的，且当前节点为右子节点
                if (node == parent.getRight()) {
                    // 从父节点出左旋
                    leftRotate(parent);
                    // 然后调换父节点和当前节点，准备右旋
                    RBNode<T> tmp = parent;
                    parent = node;
                    node = tmp;
                }
                // 叔叔节点是黑色的，且当前节点为左子节点
                parent.setColor(RBNode.BLACK);
                grandparent.setColor(RBNode.RED);
                rightRotate(grandparent);
            } else {
                // 此时父节点是祖父节点的右子节点
                RBNode<T> uncle = grandparent.getLeft();
                // 叔叔节点为红色
                if (uncle != null && isRed(uncle)) {
                    parent.setColor(RBNode.BLACK);
                    uncle.setColor(RBNode.BLACK);
                    grandparent.setColor(RBNode.RED);
                    node = grandparent;
                    continue;
                }
                // 叔叔节点是黑色的，且当前节点为左子节点
                if(node == parent.getLeft()){
                    rightRotate(parent);
                    RBNode<T> tmp = parent;
                    parent = node;
                    node = tmp;
                }
                // 叔叔节点是黑色的，且当前节点为右子节点
                parent.setColor(RBNode.BLACK);
                grandparent.setColor(RBNode.RED);
                leftRotate(grandparent);
            }
        }
        // 将根节点设置为黑色
        this.root.setColor(RBNode.BLACK);
    }

    public boolean isRed(RBNode<T> x) {
        return x.getColor().equals("R");
    }

    public boolean isBlack(RBNode<T> x) {
        return x.getColor().equals("B");
    }

}
