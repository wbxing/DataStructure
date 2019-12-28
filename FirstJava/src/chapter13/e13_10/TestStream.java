package chapter13.e13_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        // 取得 Stream 对象
//        Stream<String> s = a.stream();
//        // 统计数据数目
//        System.out.println(s.count());

        a.add("D");
        a.add("D");
        a.add("abc");
        a.add("ABC");
        a.add("aBC");
        a.add("Abc");

        Stream<String> s = a.stream();
//        // 去掉重复数据后形成新的 List 集合
//        List<String> newList = s.distinct().collect(Collectors.toList());
//        newList.forEach(System.out::println);

//        // 数据筛选
//        List<String> newList = s.distinct().filter((x) -> x.contains("A")).collect(Collectors.toList());
//        newList.forEach(System.out::println);

//        // 数据处理后的过滤
//        List<String> newList = s.distinct().map(String::toLowerCase).
//                filter((x) -> x.contains("a")).collect(Collectors.toList());
//        newList.forEach(System.out::println);

//        // 数据分页操作
//        List<String> newList = s.distinct().map(String::toLowerCase).
//                filter((x) -> x.contains("a")).skip(1).limit(2).
//                collect(Collectors.toList());
//        newList.forEach(System.out::println);

        // 数据匹配查询
//        if (s.anyMatch((x) -> x.contains("b"))) {
//            System.out.println("数据存在");
//        }
        // 设置多个条件
        Predicate<String> p1 = (x) -> x.contains("a");
        Predicate<String> p2 = (x) -> x.contains("b");
        if (s.anyMatch(p1.and(p2))) {
            System.out.println("数据存在");
        }

    }
}
