package data.structure.hash;

import data.structure.hash.DataItem;

public class HashChain {

    private OrderLinkedList[] hashArray;
    private int arraySize;

    public HashChain(int size) {
        this.arraySize = size;
        this.hashArray = new OrderLinkedList[this.arraySize];
        // new 出每个空链表初始化数组
        for (int i = 0; i < this.arraySize; i++) {
            this.hashArray[i] = new OrderLinkedList();
        }
    }

    public void displayTable() {
        for (int i = 0; i < this.arraySize; i++) {
            System.out.print(i + "：");
            this.hashArray[i].display();
        }
    }

    public int hashFunction(int key) {
        return (key % this.arraySize);
    }

    public void insert(DataItem node) {
        int key = node.getKey();
        int hashVal = hashFunction(key);
        // 直接添加
        this.hashArray[hashVal].insert(node);
    }

    public DataItem delete(int key) {
        int hashVal = hashFunction(key);
        DataItem temp = find(key);
        // 从链表中找到要删除的数据项，直接删除
        this.hashArray[hashVal].delete(key);
        return temp;
    }

    public DataItem find(int key) {
        int hashVal = hashFunction(key);
        return this.hashArray[hashVal].find(key);
    }
}
