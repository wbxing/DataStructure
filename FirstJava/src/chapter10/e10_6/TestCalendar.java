package chapter10.e10_6;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        // 取得当前日期
        Calendar calendar = Calendar.getInstance();
        StringBuffer buffer = new  StringBuffer();

        buffer.append(calendar.get(Calendar.YEAR)).append("-");
        // 月份是从 0 开始表示的
        buffer.append(calendar.get(Calendar.MONTH) + 1).append("-");
        buffer.append(calendar.get(Calendar.DAY_OF_MONTH)).append(" ");
        buffer.append(calendar.get(Calendar.HOUR_OF_DAY)).append(":");
        buffer.append(calendar.get(Calendar.MINUTE)).append(":");
        buffer.append(calendar.get(Calendar.SECOND));

        System.out.println(buffer);

        // 取得五天后的日期
        buffer = new  StringBuffer();

        buffer.append(calendar.get(Calendar.YEAR)).append("-");
        buffer.append(calendar.get(Calendar.MONTH) + 1).append("-");
        // 5 天后
        buffer.append(calendar.get(Calendar.DAY_OF_MONTH) + 5).append(" ");
        buffer.append(calendar.get(Calendar.HOUR_OF_DAY)).append(":");
        buffer.append(calendar.get(Calendar.MINUTE)).append(":");
        buffer.append(calendar.get(Calendar.SECOND));
        System.out.println(buffer);
    }
}
