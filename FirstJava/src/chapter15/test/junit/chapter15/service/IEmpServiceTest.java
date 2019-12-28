package chapter15.service;

import chapter15.factory.ServiceFactory;
import chapter15.vo.Emp;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class IEmpServiceTest {
    private static int empNo;
    static {
        // 动态生成一个 empNo 的数据
        empNo = new Random().nextInt(10000);
    }
    @Test
    public void insert() {
        Emp vo = new Emp();
        vo.setEmpNo(empNo);
        vo.setEmpName("zhang - " + empNo);
        vo.setJob("HR - " + empNo);
        vo.setHireDate(new Date());
        vo.setSalary(1000.0);
        vo.setComm(1000.0);
        try {
            TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().insert(vo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update() {
        Emp vo = new Emp();
        vo.setEmpNo(8888);
        vo.setEmpName("wang - " + empNo);
        vo.setJob("HR - " + empNo);
        vo.setHireDate(new Date());
        vo.setSalary(1000.0);
        vo.setComm(1000.0);
        try {
            TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().update(vo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete() {
        Set<Integer> ids = new HashSet<>();
        ids.add(8888);
        try {
            TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().delete(ids));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void get() {
        try {
            TestCase.assertNotNull(ServiceFactory.getIEmpServiceInstance().get(1357));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void list() {
        try {
            TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().list().size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testList() {
        try {
            Map<String, Object> map = ServiceFactory.getIEmpServiceInstance()
                    .list(2, 5, "ename", "");
            int count = (Integer) map.get("empCount");
            List<Emp> allEmp = (List<Emp>) map.get("allEmps");
            TestCase.assertTrue(count > 0 && allEmp.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}