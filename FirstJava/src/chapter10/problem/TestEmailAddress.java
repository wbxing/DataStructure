package chapter10.problem;

/**
 * 输入一个email地址，之后使用正则表达式验证该email地址是否正确
 */
public class TestEmailAddress {
    public static void main(String[] args) {
        String emailAddress = "wang@mail.tsinghua.edu.cn";
        String regex1 = "[a-zA-Z][a-zA-Z0-9_.]{0,28}[a-zA-Z0-9]";
        String regex2 = "@\\w+(\\.\\w+)?\\.(com|com\\.cn|cn|net|org|gov|gov\\.cn|edu|edu\\.cn)";
        System.out.println(emailAddress.matches(regex1 + regex2));
    }
}
