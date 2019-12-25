package data.structure.tree.twothreefour;

public class Tree234 {
    // 数据项
    private class DataItem {
        private long data;

        public DataItem(long dData) {
            this.data = dData;
        }

        public long getData() {
            return this.data;
        }

        public void displayItem() {
            System.out.println("/" + this.data);
        }
    }

    // 节点类
    private class Node {
        public static final int ORDER = 4;
        // 节点数据项的数目
        private int numItems;
        // 父节点
        private Node parent;
        // 子节点，最多四个
        private Node[] childArray = new Node[ORDER];
        // 数据项，最多三个
        private DataItem[] itemArray = new DataItem[ORDER - 1];

        // 连接子节点
        public void connectChild(int childNum, Node child) {
            this.childArray[childNum] = child;
            if (child != null) {
                child.parent = this;
            }
        }

        // 断开与子节点的连接，返回该节点
        public Node disconnectChild(int childNum) {
            Node tempNode = this.childArray[childNum];
            this.childArray[childNum] = null;
            return tempNode;
        }

        // 得到节点的某个子节点
        public Node getChild(int childNum) {
            return this.childArray[childNum];
        }

        // 判断是否是叶节点
        public boolean isLeaf() {
            return this.childArray[0] == null;
        }

        //得到节点的某个数据项
        public DataItem getItem(int index) {
            return this.itemArray[index];
        }

        // 判断节点的数据项是否满了（最多3个）
        public boolean isFull() {
            return numItems == ORDER - 1;
        }

        // 找到数据项在节点中的位置
        public int findItem(long key) {
            for (int j = 0; j < ORDER - 1; j++) {
                if (this.itemArray[j] == null) {
                    break;
                } else if (this.itemArray[j].getData() == key) {
                    return j;
                }
            }
            return -1;
        }

        // 将数据项插入到节点
        public int insertItem(DataItem newItem) {
            this.numItems++;
            long newKey = newItem.getData();
            for (int j = ORDER - 2; j >= 0; j--) {
                if (this.itemArray[j] != null) {
                    //保存节点某个位置的数据项
                    long itsKey = this.itemArray[j].getData();
                    if (newKey < itsKey) {
                        //如果比新插入的数据项大,将大数据项向后移动一位
                        this.itemArray[j + 1] = this.itemArray[j];
                    } else {
                        this.itemArray[j + 1] = newItem;
                        //如果比新插入的数据项小，则直接插入
                        return j + 1;
                    }
                }
            }
            //如果都为空，或者都比待插入的数据项大，则将待插入的数据项放在节点第一个位置
            this.itemArray[0] = newItem;
            return 0;
        }

        // 移除节点的数据项
        public DataItem removeItem() {
            DataItem temp = this.itemArray[this.numItems - 1];
            this.itemArray[this.numItems - 1] = null;
            this.numItems--;
            return temp;
        }

        // 打印节点的所有数据项
        public void displayNode() {
            for (int j = 0; j < numItems; j++) {
                itemArray[j].displayItem();
            }
            System.out.println("/");
        }

        public Node getParent() {
            return this.parent;
        }

        public int getNumItems() {
            return this.numItems;
        }


    }
    ///////// 以上为内部类 /////////

    private Node root = new Node();

    // 查找关键字值
    public int find(long key) {
        Node curNode = this.root;
        int childNumber;
        while (true) {
            if ((childNumber = curNode.findItem(key)) != -1) {
                return childNumber;
            } else if (curNode.isLeaf()) {
                // 节点是叶节点
                return -1;
            } else {
                curNode = getNextChild(curNode, key);
            }
        }
    }

    public Node getNextChild(Node theNode, long theValue) {
        int j;
        int numItems = theNode.getNumItems();
        for (j = 0; j < numItems; j++) {
            if (theValue < theNode.getItem(j).getData()) {
                return theNode.getChild(j);
            }
        }
        return theNode.getChild(j);
    }

    // 插入数据项
    public void insert(long dValue) {
        Node curNode = this.root;
        DataItem tempItem = new DataItem(dValue);
        while (true) {
            if (curNode.isFull()) {
                // 如果节点满数据项了，则分裂节点
                split(curNode);
                curNode = curNode.getParent();
                curNode = getNextChild(curNode, dValue);
            } else if (curNode.isLeaf()) {
                // 当前节点是叶节点
                break;
            } else {
                curNode = getNextChild(curNode, dValue);
            }
        }
        curNode.insertItem(tempItem);
    }

    // 节点分裂
    public void split(Node thisNode) {
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;
        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);
        Node newRight = new Node();
        if (thisNode == this.root) {
            // 如果当前节点是根节点，执行根分裂
            this.root = new Node();
            parent = this.root;
            this.root.connectChild(0, thisNode);
        } else {
            parent = thisNode.getParent();
        }
        // 处理父节点
        itemIndex = parent.insertItem(itemB);
        int n = parent.getNumItems();
        for (int j = n - 1; j > itemIndex; j--) {
            Node temp = parent.disconnectChild(j);
            parent.connectChild(j + 1, temp);
        }
        parent.connectChild(itemIndex + 1, newRight);
        // 处理新建的右节点
        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }

    // 打印树节点
    public void displayTree() {
        recDisplayTree(this.root, 0, 0);
    }

    private void recDisplayTree(Node thisNode, int level, int childNumber) {
        System.out.println("level = " + level + " child = " + childNumber + " ");
        thisNode.displayNode();
        int numItems = thisNode.getNumItems();
        for (int j = 0; j < numItems + 1; j++) {
            Node nextNode = thisNode.getChild(j);
            if (nextNode != null) {
                recDisplayTree(nextNode, level + 1, j);
            } else {
                return;
            }
        }
    }
}
