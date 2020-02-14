package interview.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTrimTest {

    @Test
    public void testMyTrim() {
        String string = "   h   ";
        String result = "hello";
        System.out.println(MyTrim.myTrim(string));
        System.out.println(result.equals(MyTrim.myTrim(string)));
    }
}