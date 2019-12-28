package chapter15.service.impl;

import chapter15.dbc.DBConnection;
import chapter15.factory.DAOFactory;
import chapter15.service.IEmpService;
import chapter15.vo.Emp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmpServiceImpl implements IEmpService {
    // 数据库连接实例化对象
    private DBConnection dbc = new DBConnection();
    @Override
    public boolean insert(Emp vo) throws Exception {
        try {
            // 要增加的雇员编号不存在，则 findById() 返回的就是 null
            if (DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(vo.getEmpNo()) == null) {
                // 直接返回 DAOFactory.doCreate() 方法的处理结果
                return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doCreate(vo);
            }
            // 雇员信息存在，添加失败
            return false;
        } catch (Exception e) {
            // 异常交由被调用处进行处理
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean update(Emp vo) throws Exception {
        try {
            // 根据 id 进行全部更新
            // 直接返回数据层的处理结果
            return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doUpdate(vo);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean delete(Set<Integer> ids) throws Exception {
        try {
            // 没有要删除的数据直接返回 false
            if (ids == null || ids.size() == 0) {
                return false;
            }
            // 集合非空时，调用数据层实现数据删除
            return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).removeBatch(ids);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public List<Emp> list() throws Exception {
        try {
            // 直接返回数据层的查询结果
            return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAll();
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public Emp get(int ids) throws Exception {
        try {
            // 直接返回数据层的查询结果
            return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(ids);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public Map<String, Object> list(int currentPage, int lineSize, String column, String keywords) throws Exception {
        try {
            // 返回值有多种数据类型，使用 Map 集合保存
            Map<String, Object> map = new HashMap<>();
            // 分页查询
            List<Emp> allEmps = DAOFactory.getIEmpDAOInstance(this.dbc.getConnection())
                    .findAllSplit(currentPage, lineSize, column, keywords);
            map.put("allEmps", allEmps);
            // 统计数据量
            int empCount = DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).getAllCount(column, keywords);
            map.put("empCount", empCount);
            return map;
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }
}
