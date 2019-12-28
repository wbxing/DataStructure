package chapter3.e3_13.LinkedList;

public class Link {
    /**
     * 内部类 表示节点信息与相关操作
     */
    private class Node {
        private Object data;
        private Node next;
        public Node() {}
        public Node (Object data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }
        public boolean containsNode(Object data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(data);
                } else {
                    return false;
                }
            }
        }
        public Object getNode(int index) {
            if (Link.this.foot == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }
        public void setNode(int index, Object data) {
            if (Link.this.foot == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }
        public void removeNode(Node previous, Object data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }
        public void toArrayNode() {
            Link.this.arrays[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }
    }
    // ============= 以上为内部类 =============

    private Node root;
    private int count = 0;
    private int foot = 0;
    private Object [] arrays;
    // 数据增加
    public void add(Object data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count ++;
    }
    // 取得元素个数
    public int size() {
        return this.count;
    }
    // 判空
    public boolean isEmpty() {
        return this.count == 0;
    }
    // 数据查询
    public boolean contains(Object data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }
    // 根据索引取得数据
    public Object get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }
    // 根据索引修改数据
    public void set(int index, Object data) {
        if (index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }
    // 数据删除
    public void remove(Object data) {
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.count --;
        }
    }
    // 转换为对象数组
    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.arrays = new Object[this.count];
        this.root.toArrayNode();
        return this.arrays;
    }
    // 清空链表
    public void clear() {
        this.root = null;
        this.count = 0;
    }
}
