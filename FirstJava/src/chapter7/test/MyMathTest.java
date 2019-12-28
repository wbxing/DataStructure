package chapter7.test;

import chapter7.e7_1.MyMath;
import junit.framework.TestCase;
import org.junit.Test;

public class MyMathTest {
    @Test
    public void div() {
        try {
            TestCase.assertEquals(MyMath.div(10, 2), 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}