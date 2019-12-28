package chapter10.problem;

/**
 *  编写正则表达式，判断给定的是否是一个合法的ip地址
 */
public class TestIPAddress {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        String regex = "\\d{1,3}(\\.\\d{1,3}){3}";
        System.out.println(ipAddress.matches(regex));
    }
}
