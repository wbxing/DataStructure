package interview.code;

/**
 * 浮点数精度问题
 */
public class FloatPrimitiveTest {

    public static void main(String[] args) {
        float a = 1.0F - 0.9F;
        float b = 0.9F - 0.8F;
        System.out.println(a);
        System.out.println(b);
        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
