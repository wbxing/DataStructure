package chapter10.e10_8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRegex {
    public static void main(String[] args) throws Exception {
        // 判断字符串是否全部由 ‘0’ - ‘9’ 组成
        String string = "123";
        System.out.println(isNumber(string));

        // 正则表达式
        System.out.println(string.matches("\\d+"));


        // 实现字符串的替换
        String str = "hello*)(*()hello(*#world*";
        // 编写正则表达式，表示非小写字母
        String regex = "[^a-z]";
        System.out.println(str.replaceAll(regex, ""));

        // 字符串拆分
        str = "hello156dsagf457hello125sa43a657world12";
        regex = "\\d+";
        String[] strings = str.split(regex);
        for(String s : strings) {
            System.out.println(s);
        }

        // 判断是否为IPv4地址
        str = "192.168.1.1";
        regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        System.out.println(str.matches(regex));
        // 简化正则表达式
        regex = "(\\d{1,3}\\.){3}\\d{1,3}";
        System.out.println(str.matches(regex));

        // 判断日期格式
        str = "2019-08-23";
        regex = "\\d{4}(-\\d{2}){2}";
        if(str.matches(regex)) {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            System.out.println(date);
        }

        // 判断电话号码
        str = "(010)-51283346";
        regex = "((\\(\\d{3}\\)-)|(\\d{3}-))?\\d{7,8}";
        System.out.println(str.matches(regex));

        // 验证简单 email 地址
        str = "wembiaoxing@gamil.com";
        regex = "\\w+@\\w+\\.\\w+";
        System.out.println(str.matches(regex));

        // 验证复杂 email 地址
        str = "wb_xing123@mail1.tsinghua.edu.cn";
        regex = "[a-zA-z][a-zA-Z0-9_.]{0,28}[a-zA-Z0-9]" + "@\\w+(\\.\\w+)?\\.(com|net|cn|com\\.cn|net\\.cn|org|gov|edu|edu\\.cn)";
        System.out.println(str.matches(regex));
    }

    private static boolean isNumber(String string) {
        if (string == null || "".equals(string)) {
            return false;
        }
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (ch > '9' || ch < '0') {
                return false;
            }
        }
        return true;
    }
}
