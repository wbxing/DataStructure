package chapter6.e6_7;

public class AssertKey {
    public static void main(String[] args) {
        int num = 10;
        // 断言需要 -ea 参数才能启动
        assert num == 20 : "num 的内容不是20";
        System.out.println("num = " + num);
    }
}
