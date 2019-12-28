package chapter15.test;

import chapter15.factory.ServiceFactory;
import chapter15.vo.Emp;

import java.util.List;
import java.util.Map;

public class TestEmpSplit {
    public static void main(String[] args) {
        // 实现数据分页查询操作
        // 返回查询结果和数量
        try {
            Map<String, Object> map = ServiceFactory.getIEmpServiceInstance()
                    .list(1, 5, "ename", "");
            int count = (Integer) map.get("empCount");
            System.out.println("数据量：" + count);
            List<Emp> list = (List<Emp>) map.get("allEmp");
            for (Emp vo : list) {
                System.out.println(vo.getEmpName() + ", " + vo.getJob());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
