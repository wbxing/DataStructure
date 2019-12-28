package chapter10.problem;

/**
 * 定义一个StringBuffer类对象
 * 通过append()方法向对象里添加26个小写字母
 * 要求每次只添加一次，共添加26次
 */

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            sb.append((char)('a' + i));
        }
        System.out.println(sb);
    }
}
