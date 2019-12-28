package chapter13.e13_1;

import java.util.ArrayList;
import java.util.Collection;

public class TestArrayList {
    public static void main(String[] args) {
        // JDK1.5 引入了泛型，保证集合中所有数据类型都一致
        // List<String> list = new ArrayList<>();
        Collection<String> list = new ArrayList<>();
        System.out.println("长度：" + list.size() + "是否为空：" + list.isEmpty());
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        System.out.println("长度：" + list.size() + "是否为空：" + list.isEmpty());

        // Collection 接口定义 size() 方法取得集合长度，List 子接口扩充 get() 方法根据索引取得了数据
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            System.out.println(str);
//        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}
