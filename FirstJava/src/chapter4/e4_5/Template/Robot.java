package chapter4.e4_5.Template;

public class Robot extends Action {
    public void eat() {
        System.out.println("机器人正在充电");
    }

    public void work() {
        System.out.println("机器人正在工作");
    }

    public void sleep() {
        // 无操作
    }
}
