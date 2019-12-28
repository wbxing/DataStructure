package chapter15.service;

import chapter15.vo.Emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义 Emp 表的业务层执行标准
 * 通过 DAOFactory 取得 IEmpDAO 接口对象
 *
 */
public interface IEmpService {
    /**
     * 实现 Emp 表的数据增加操作
     * 调用 IEmpDAO.findById() 方法，判断要增加的数据是否存在
     * 如果不存在，调用 IEmpDAO.doCreate() 方法，返回结果
     * @param vo 包含了要增加数据的VO对象
     * @return 如果增加数据的 Id 存在或者保存失败，返回 False，否则返回 True
     * @throws Exception SQL 执行异常
     */
    boolean insert(Emp vo) throws Exception;

    /**
     * 实现 Emp 表的数据修改操作
     * 调用 IEmpDAO.doUpdate() 方法，本次修改为修改全部内容
     * @param vo 包含了要增加数据的VO对象
     * @return 修改成功返回 True，否则返回 False
     * @throws Exception SQL 执行异常
     */
    boolean update(Emp vo) throws Exception;

    /**
     * 实现 Emp 表的数据的删除操作，可以删除多个数据
     * 调用 IEmpDAO.doRemoveBatch() 方法
     * @param ids 全部要删除数据的集合，无重复值
     * @return 删除成功返回 True，否则返回 False
     * @throws Exception SQL 执行异常
     */
    boolean delete(Set<Integer> ids) throws Exception;

    /**
     * 根据编号查找全部雇员信息
     * 调用 IEmpDAO.findById() 方法
     * @param ids 要查找雇员的编号
     * @return 查找成功，将雇员信息以 VO 对象的形式返回，否则返回 null
     * @throws Exception SQL 执行异常
     */
    Emp get(int ids) throws Exception;

    /**
     * 查询全部雇员信息
     * @return 查询结果以 List 集合的形式返回，如果没有数据则集合长度为0
     * @throws Exception SQL 执行异常
     */
    List<Emp> list() throws Exception;

    /**
     * 实现数据的模糊查询以及数据统计
     * 调用 IEmpDAO.findAllSplit() 方法，查询所有的表数据，返回 List<Emp>
     * 调用 调用 IEmpDAO.getAllCount() 方法，查询所有数据量，返回 Integer
     * @param currentPage 当前所在页
     * @param lineSize 每页记录数
     * @param column 模糊查询数据列
     * @param keywords 模糊查询关键字
     * @return 返回多种数据类型，如下
     * key = allEmps, value = IEmpDAO.findAllSplit() 返回结果（ List<Emp> 类型）
     * key = empCount, value = IEmpDAO.getAllCount() 返回结果（ Integer 类型）
     * @throws Exception SQL 执行异常
     */
    Map<String, Object> list(int currentPage, int lineSize, String column, String keywords) throws Exception;
}
