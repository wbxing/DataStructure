package interview.java;

/**
 * 获取一个字符串在另一个字符串中出现的次数
 *
 * 比如
 * string = "abkkcadkabkebfkabkskab", substring = "ab"
 * result = 4
 */
public class SubstringCount {

    public static int getCount(String string, String substring) {
        int stringLength = string.length();
        int substringLength = substring.length();
        int count = 0;
        if (stringLength < substringLength) {
            return 0;
        } else if (stringLength == substringLength) {
            if (string.equals(substring)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int index = 0;
            while ((index = string.indexOf(substring, index)) != -1) {
                count++;
                index += substringLength;
            }
            return count;
        }
    }
}
