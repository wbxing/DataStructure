package chapter13.e13_11;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class TestMapReduce {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order("Java", 89.9, 200));
        orders.add(new Order("Android", 79.9, 500));
        orders.add(new Order("Jsp", 69.9, 300));
        orders.add(new Order("iOS", 59.9, 100));
        orders.add(new Order("oracle", 49.9, 500));

//        // 统计各个商品的总价
//        orders.stream().
//                map((x) -> x.getPrice() * x.getCount()).
//                forEach(System.out::println);

//        // 计算总价
//        double allPrice =  orders.stream().map((x) -> x.getPrice() * x.getCount()).reduce(Double::sum).get();
//        System.out.println("总价：" + allPrice);

        // 实现数据统计操作
        DoubleSummaryStatistics dss = orders.stream().
                mapToDouble((x) -> x.getCount() * x.getPrice()).summaryStatistics();
        System.out.println("商品数目：" + dss.getCount());
        System.out.println("总价：" + dss.getSum());
        System.out.println("平均价格：" + dss.getAverage());
        System.out.println("最高价格：" + dss.getMax());
        System.out.println("最低价格：" + dss.getMin());

    }
}
