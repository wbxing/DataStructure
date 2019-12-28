package chapter6.e6_4;

public class ThrowKey {
    public static void main(String[] args) {
        try {
            throw new Exception("自己定义的异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
