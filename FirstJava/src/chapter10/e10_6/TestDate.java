package chapter10.e10_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        // long 与 Date 之间互相转换
        long time = System.currentTimeMillis();
        date = new Date(time);
        System.out.println(date);
        System.out.println(date.getTime());

        // 格式化显示日期
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        // date 转换为 String 类型
        String str = sdf.format(date);
        System.out.println(str);

        // 字符串转日期
        str = "2019-08-20 18:00:17.234";
        date = sdf.parse(str);
        System.out.println(date);

        // 错误的日期，自动进位
        // 格式不符合就会异常
        str = "2019-08-32 18:00:17.234";
        date = sdf.parse(str);
        System.out.println(date);
    }
}
