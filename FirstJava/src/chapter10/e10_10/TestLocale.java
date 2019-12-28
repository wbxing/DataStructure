package chapter10.e10_10;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
    public static void main(String[] args) throws Exception {
        // 取得默认的 Locale 对象
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        // Locale 中的常量
        locale = Locale.CHINA;
        System.out.println(locale);

        // 读取资源文件
        ResourceBundle rb = ResourceBundle.getBundle("chapter10.e10_10.resources.Messages");
        System.out.println(rb.getString("key"));

        Locale zhLocale = new Locale("zh", "CN");
        Locale enLocale = new Locale("en", "US");
        ResourceBundle zhRB = ResourceBundle.getBundle("chapter10.e10_10.resources.Messages", zhLocale);
        ResourceBundle enRB = ResourceBundle.getBundle("chapter10.e10_10.resources.Messages", enLocale);

        System.out.println(MessageFormat.format(zhRB.getString("key"), "张三"));
        System.out.println(MessageFormat.format(enRB.getString("key"), "zhang"));

    }
}
