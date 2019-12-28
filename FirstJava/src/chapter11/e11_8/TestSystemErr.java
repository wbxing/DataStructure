package chapter11.e11_8;

public class TestSystemErr {
    @SuppressWarnings("ThrowablePrintedToSystemOut")
    public static void main(String[] args) {
        // 此处会发生异常
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // 输出不希望被用户看到的异常
            System.err.println(e);
            // 输出
            System.out.println(e);
        }
    }
}
