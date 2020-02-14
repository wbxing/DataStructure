package interview.java;

/**
 * 模拟 trim 方法
 *
 * 比如：
 * str = "   hello   "
 * result = "hello"
 */
public class MyTrim {

    public static String myTrim(String string) {

        if (string == null) {
            return null;
        }

        int start = 0;
        int end = string.length() - 1;

        while ((start < end) && string.charAt(start) == ' ') {
            start++;
        }
        while ((start < end) && string.charAt(end) == ' ') {
            end--;
        }

        if (string.charAt(start) == ' ') {
            return "";
        }
//        if (string.equals(" ")) {
//            return "";
//        }
        return string.substring(start, end + 1);
    }
}
