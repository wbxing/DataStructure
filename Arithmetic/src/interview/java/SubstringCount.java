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
            int index;
            while ((index = string.indexOf(substring)) != -1) {
                count++;
                string = string.substring(index + substringLength);
            }
            return count;
        }
    }
}
