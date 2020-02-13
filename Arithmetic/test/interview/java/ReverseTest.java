package interview.java;

import org.junit.Test;

public class ReverseTest {

    @Test
    public void testReverse() {
        String str = "helloworld";
        String result = Reverse.reverse(str, 1, str.length() - 2);
        System.out.println(result);
        System.out.println("hlrowolled".equals(result));
    }
}
