package chapter3.e3_9.ProvinceAndCity.Test;

import chapter3.e3_9.ProvinceAndCity.City;
import chapter3.e3_9.ProvinceAndCity.Province;

public class TestPC {
    public static void main(String[] args) {
        // 设置关系数据
        // 对象数据
        Province pro = new Province(1, "河北省");
        City [] cities = new City[3];
        cities[0] = new City(1001, "唐山");
        cities[1] = new City(1002, "秦皇岛");
        cities[2] = new City(1003, "石家庄");
        // 设置关系
        pro.setCities(cities);
        for (City c : cities) {
            c.setProvince(pro);
        }
        // 取出关系数据
        for (City c : cities) {
            System.out.println(c.getInfo());
            System.out.println("\t|- " + c.getProvince().getInfo());
        }
        System.out.println(pro.getInfo());
        for (City c : pro.getCities()) {
            System.out.println("\t|- " + c.getInfo());
        }
    }
}
