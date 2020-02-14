package interview.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestSubstringTest {

    @Test
    public void getLargestSubstring() {
        String str1 = "abcwerthelloyuiodefworld";
        String str2 = "cvhellonmworld";
        String result = "[hello, world]";
        System.out.println(Arrays.toString(LargestSubstring.getLargestSubstring(str1, str2)));
        System.out.println(result.equals(Arrays.toString(LargestSubstring.getLargestSubstring(str1, str2))));
    }
}