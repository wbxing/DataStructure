package chapter10.e10_8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternAndMatcher {
    public static void main(String[] args) {
        // 利用 Pattern 实现字符串的拆分
        String string = "iowtegf1243hqreio123gfhv1294qwedsgbvfdh78298plkds213afew";
        String regex = "\\d+";
        // 编译正则
        Pattern pattern = Pattern.compile(regex);
        // 拆分字符串
        String[] strings = pattern.split(string);
        System.out.println(Arrays.toString(strings));

        // 利用 Matcher 实现字符串验证
        string = "100";
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}
