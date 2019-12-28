package chapter13.e13_6;

import java.util.HashMap;
import java.util.Map;

public class TestMapKey {
    public static void main(String[] args) {
        // 自定义 Book 类作为 Map 集合的 Key
        // Book 类必须正确覆写 hashCode() 和 equals() 两个方法
        // 尽量不要使用自定义的数据类型作为 Key
        Map<Book, String> map = new HashMap<>();
        map.put(new Book("Java 开发"), "Java");
        System.out.println(map.get(new Book("Java 开发")));
    }
}
