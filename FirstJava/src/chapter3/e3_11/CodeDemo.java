package chapter3.e3_11;

public class CodeDemo {

    public CodeDemo() {
        System.out.println("构造函数");
    }
    {
        // 构造块
        System.out.println("构造块");
    }
    static {
        // 静态块
        System.out.println("静态块");
    }

}
