package chapter3.e3_6;

public class StringDemo {
    /**
     * 判断字符串是否全部有数字构成
     * @param s 待判断字符串
     * @return 判断结果
     */
    public boolean isNumber(String s) {
        char [] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch > '9' || ch < '0') {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串首字母大写
     * @param s 引用字符串
     * @return 首字母大写之后的结果字符串
     */
    public String initCap(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
