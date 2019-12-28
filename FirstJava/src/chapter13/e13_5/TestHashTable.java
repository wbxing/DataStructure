package chapter13.e13_5;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashTable {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);

        // 查询操作
        System.out.println(map.get("one"));
        System.out.println(map.get("six"));

        // Iterator 实现 Map 接口的输出
        // 将 Map 集合变成 Set 集合，目的是使用 Iterator 方法
        // 注意泛型统一
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> mapEntry = iterator.next();
            System.out.println(mapEntry.getKey() + " = " + mapEntry.getValue());
        }
    }
}
