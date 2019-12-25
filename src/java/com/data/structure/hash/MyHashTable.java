package java.com.data.structure.hash;

public class MyHashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private int itemNum;
    private DataItem nonItem;

    public MyHashTable(int arraySize) {
        this.arraySize = arraySize;
        this.hashArray = new DataItem[arraySize];
        // 删除的数据项，下标置为 -1
        this.nonItem = new DataItem(-1);
    }

    // 哈希函数
    public int hashFunction(int key) {
        return key % this.arraySize;
    }

    // 判满
    public boolean isFull() {
        return (this.arraySize == this.itemNum);
    }

    // 判空
    public boolean isEmpty() {
        return (this.itemNum == 0);
    }

    // 删除数据
    public DataItem delete(int key) {
        if (isEmpty()) {
            System.out.println("Hash Table is Empty!");
            return null;
        }
        int hashVal = hashFunction(key);
        while (this.hashArray[hashVal] != null) {
            if (this.hashArray[hashVal].getKey() == key) {
                DataItem temp = this.hashArray[hashVal];
                this.hashArray[hashVal] = this.nonItem;
                this.itemNum--;
                return temp;
            }
            hashVal++;
            hashVal %= arraySize;
        }
        return null;
    }

    // 查找数据
    public DataItem find(int key) {
        int hashVal = hashFunction(key);
        while (this.hashArray[hashVal] != null) {
            if (this.hashArray[hashVal].getKey() == key) {
                return this.hashArray[hashVal];
            }
            hashVal++;
            hashVal %= this.arraySize;
        }
        return null;
    }

    /**
     * 插入数据，涉及哈希表的扩展
     *
     * @param item 需要插入的数据项
     */
    public void insert(DataItem item) {
        if (isFull()) {
            // 扩展哈希表
            System.out.println("哈希表已满，重新哈希化...");
            // 哈希表扩展函数
            extendHashTable();
        }
        int key = item.getKey();
        int hashVal = hashFunction(key);
        while (this.hashArray[hashVal] != null && this.hashArray[hashVal].getKey() != -1) {
            hashVal++;
            hashVal %= this.arraySize;
        }
        this.hashArray[hashVal] = item;
        this.itemNum++;
    }

    // 打印
    public void display() {
        System.out.println("Table:");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.print(hashArray[i].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
    }

    /**
     * 数组有固定的大小，而且不能扩展，所以扩展哈希表只能另外创建一个更大的数组，然后把旧数组中的数据插到新的数组中。
     * 但是哈希表是根据数组大小计算给定数据的位置的，所以这些数据项不能再放在新数组中和老数组相同的位置上。
     * 因此不能直接拷贝，需要按顺序遍历老数组，并使用 insert 方法向新数组中插入每个数据项。
     * 这个过程叫做重新哈希化。这是一个耗时的过程，但如果数组要进行扩展，这个过程是必须的。
     */
    public void extendHashTable() {
        int num = this.arraySize;
        // 重新开始计数
        this.itemNum = 0;
        // 数组大小翻倍
        this.arraySize *= 2;
        DataItem[] oldHashArray = this.hashArray;
        this.hashArray = new DataItem[this.arraySize];
        for (int i = 0; i < num; i++) {
            insert(oldHashArray[i]);
        }
    }
}
