package interview.java;

import sun.security.util.Length;

/**
 * 获取两个字符串的最大相同子串
 * <p>
 * 比如
 * str1 = "abcwerthelloyuiodef", str2 = "cvhellonm"
 * result = "hello"
 */
public class LargestSubstring {

    public static String[] getLargestSubstring(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return null;
        }

        String maxString = (str1.length() >= str2.length()) ? str1 : str2;
        String minString = (str1.length() < str2.length()) ? str1 : str2;
        int minLength = minString.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            for (int x = 0, y = minLength - i; y <= minLength; x++, y++) {
                String largestSubstring = minString.substring(x, y);
                if (maxString.contains(largestSubstring)) {
                    sb.append(largestSubstring).append(",");
                }
            }
            if (sb.length() != 0) {
                break;
            }
        }
        // 去除末尾 "," 后，按照 "," 切分成字符串数组
        return sb.toString().replaceAll(",$", "").split(",");
    }
}
