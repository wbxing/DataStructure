package chapter_10;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 设置时间
        c.set(2004, Calendar.JANUARY, 7,15,40);
        // 将时间转成 MilliSecond
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        // 时间 加上一个小时
        c.setTimeInMillis(day1);
        // Calendar.HOUR_OF_DAY 是24小时制
        // Calendar.HOUR        是12小时制
        System.out.println("new hour " + c.get(Calendar.HOUR_OF_DAY));
        // 加上35天
        c.add(Calendar.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        // 滚动35天，注意：只有日期字段会动，月份不会动
        c.roll(Calendar.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        // 直接设定DATE的值
        c.set(Calendar.DATE, 1);
        System.out.println("set to 1 " + c.getTime());

    }
}
