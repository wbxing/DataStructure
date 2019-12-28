package chapter_10;

public class TestFormat {
    public static void main(String[] args) {
        // 数字格式化
        // 将数字以带逗号的形式输出
        String s = String.format("%,d", 1000000000);
        System.out.println(s);

        s = String.format("%,.2f", 46789.09876);
        System.out.println(s);
    }
}
