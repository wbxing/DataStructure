package chapter15.test;

import chapter15.factory.ServiceFactory;
import chapter15.vo.Emp;

import java.util.Date;

public class TestEmpInsert {
    public static void main(String[] args) {
        // 业务层与数据层都是以 VO 形式运行的
        // 追加数据必须封装在 VO 类中
        Emp vo = new Emp();
        vo.setEmpNo(1001);
        vo.setEmpName("Tom");
        vo.setJob("PE");
        vo.setHireDate(new Date());
        vo.setSalary(10000.00);
        vo.setComm(2000.0);
        // 直接输出业务层执行结果
        try {
            System.out.println(ServiceFactory.getIEmpServiceInstance().insert(vo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
