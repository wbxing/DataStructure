package chapter3.problem.Test;

/**
 * 字符串操作
 */
public class TestString {
    public static void main(String[] args) {
        // 从字符串“MLDN中心Java技术学习班20130214”中提取开班日期
        String str = "MLDN中心Java技术学习班20130214" ;
        System.out.println(str.substring(str.indexOf("20130214")));

        // 将“MLDN JAVA高端技术培训”字符串中的“Java”替换为“JAVA EE”
        str = "MLDN JAVA高端技术培训" ;
        System.out.println(str.replaceAll("Java".toUpperCase(), "JAVA EE"));

        // 取出“Java技术学习班20130214”中的第八个字符
        str = "Java技术学习班20130214" ;
        System.out.println(str.charAt(8));

        // 清除“Java技术学习班20130214”中的所有‘0’
        str = "Java技术学习班20130214" ;
        System.out.println(str.replaceAll("0", ""));

        // 从任意给定的身份证号码中提取此人的出生日期
        str = "1101051976091900520" ;
        System.out.println(str.substring(6,14));

    }
}
