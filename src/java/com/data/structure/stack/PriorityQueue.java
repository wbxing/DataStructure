package java.com.data.structure.stack;

/**
 * 优先队列
 */
public class PriorityQueue {
    // 优先队列
    private int [] queue;
    // 队列总长度
    private int size;
    // 当前队列中元素个数
    private int realSize;

    public PriorityQueue(int size) {
        this.size = size;
        this.queue = new int[this.size];
        this.realSize = 0;
    }
    // 默认创建长度为 5 的队列

    public PriorityQueue() {
        this(5);
    }

    // 插入数据
    public void insert(int element) {
        if (this.realSize == 0) {
            this.queue[this.realSize] = element;
        } else {
            // 插入排序，从大到小
            int location = this.realSize - 1;
            while (location >= 0 && element > this.queue[location]) {
                // 小的数右移
                this.queue[location + 1] = this.queue[location];
                location --;
            }
            this.queue[location + 1] = element;
        }
        this.realSize ++;
    }

    // 删除数据
    public int remove() {
        int maxPriority = this.peekMaxPriority();
        // 移除位置置为 -1
        this.queue[realSize--] = -1;
        return maxPriority;
    }

    // 查看最大优先级元素
    public int peekMaxPriority() {
        return this.queue[this.realSize - 1];
    }

    @Deprecated
    // 查看最小优先级元素
    public int peekMinPriority() {
        return this.queue[0];
    }

    // 判空
    public boolean isEmpty() {
        return this.realSize == 0;
    }

    // 判满
    public boolean isFull() {
        return this.realSize == this.size;
    }
}
