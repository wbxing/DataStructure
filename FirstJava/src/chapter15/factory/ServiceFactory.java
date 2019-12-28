package chapter15.factory;

import chapter15.service.IEmpService;
import chapter15.service.impl.EmpServiceImpl;

public class ServiceFactory {
    /**
     * 取得 IEmpService 接口对象
     * @return IEmpService 接口的实例化对象
     */
    public static IEmpService getIEmpServiceInstance() {
        return new EmpServiceImpl();
    }
}
