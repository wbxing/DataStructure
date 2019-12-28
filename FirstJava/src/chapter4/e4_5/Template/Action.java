package chapter4.e4_5.Template;

/**
 * 行为抽象类
 * 有三个子类
 * 机器人：充电、工作两个基本操作
 * 人类：吃饭、工作和睡觉三个基本操作
 * 猪：吃饭、睡觉两个基本操作
 */
public abstract class Action {
    // 定义常量
    public static final int EAT = 1;
    public static final int SLEEP = 3;
    public static final int WORK = 5;

    // 定义行为的抽象方法
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();

    /**
     * 控制行为的操作
     * @param flag 操作行为的标记
     */
    public void command(int flag) {
        switch (flag) {
            case EAT :
                this.eat();
                break;
            case SLEEP :
                this.sleep();
                break;
            case WORK :
                this.work();
                break;
            case EAT + WORK :
                this.eat();
                this.work();
                break;
        }

    }
}
