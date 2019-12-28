package chapter13.e13_5;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        // 定义 Map 集合
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        // value 为空
        map.put("null", null);
        // key 为空
        map.put(null, 0);
        System.out.println(map);

        // 查询操作
        System.out.println(map.get("one"));
        System.out.println(map.get("six"));
        System.out.println(map.get(null));
    }
}
