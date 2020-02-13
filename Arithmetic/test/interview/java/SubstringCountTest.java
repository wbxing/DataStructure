package interview.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringCountTest {

    @Test
    public void testGetCount() {
        String string = "abkkcadkabkebfkabkskab";
        String sunstring = "ab";
        System.out.println(SubstringCount.getCount(string, sunstring));
        System.out.println(4 == SubstringCount.getCount(string, sunstring));
    }
}