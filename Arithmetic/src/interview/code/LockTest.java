package interview.code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁可以保证请求资源在时间上的绝对顺序，而非公平锁有可能导致其他线程永远无法获取到锁，造成“饥饿”的现象。
 * 公平锁为了保证时间上的绝对顺序，需要频繁的上下文切换，而非公平锁会减少一些上下文切换，性能开销相对较小，可以保证系统更大的吞吐量。
 */
public class LockTest {
    private final static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        try {
            lock.tryLock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
