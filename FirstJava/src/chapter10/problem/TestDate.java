package chapter10.problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编写程序，将字符串“1981-09-19 09:07:27.727”变为Date型数据
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        String dateString = "1981-09-19 09:07:27.727";
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";

        SimpleDateFormat simple = new SimpleDateFormat(pattern);
        Date date = simple.parse(dateString);

        System.out.println(dateString);
        System.out.println(date);
    }
}
