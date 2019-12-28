package chapter15.factory;

import chapter15.dao.IEmpDAO;
import chapter15.dao.impl.EmpDAOImpl;

import java.sql.Connection;

/**
 * 定义 DAO 工厂类，以后的 DAO 接口对象将通过此工厂类取得
 *
 */
public class DAOFactory {
    /**
     * 取得 IEmpDAO 接口的对象，通过子类 EmpDAOImpl 实例化
     *
     * @param conn 构造方法需要接收数据库连接对象
     * @return IEmpDAO 接口的实例化对象
     */
    public static IEmpDAO getIEmpDAOInstance(Connection conn) {
        return new EmpDAOImpl(conn);
    }
}
