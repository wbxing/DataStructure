package chapter3.problem.Test;

/**
 * 编写程序在将字符串“want you to know one thing”，统计出字母“n”和字母“o”的出现次数
 */
public class TestCount {
    public static void main(String[] args) {
        String str = "want you to know one thing" ;     // 定义字符串
        int sum = 0 ;
        while (str.contains("n")) {                // 是否还有字母n
            sum ++ ;                                    // 数据统计量增加
            str = str.substring(str.indexOf("n") + 1);  // 改变字符串内容
        }
        System.out.println("字母n的出现次数：" + sum);
    }
}
