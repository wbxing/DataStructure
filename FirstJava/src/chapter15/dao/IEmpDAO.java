package chapter15.dao;

import chapter15.vo.Emp;

import java.util.List;
import java.util.Set;

/**
 * 定义 emp 表的数据层操作标准
 */
public interface IEmpDAO {
    /**
     * 数据增加操作
     * @param vo 要增加数据的 VO 对象
     * @return 数据是否增加成功
     * @throws Exception SQL 执行异常
     */
    boolean doCreate(Emp vo) throws Exception;

    /**
     * 数据修改操作
     * 根据 id 进行全部字段的修改
     * @param vo 要修改的数据信息，必须包含 id
     * @return 是否修改成功
     * @throws Exception SQL 执行异常
     */
    boolean doUpdate(Emp vo) throws Exception;

    /**
     * 数据批量删除操作
     * 要删除的数据以 SET 集合的形式保存
     * @param ids 要删除数据的 id，不能重复
     * @return 批量删除操作结果
     * @throws Exception SQL 执行异常
     */
    boolean removeBatch(Set<Integer> ids) throws Exception;

    /**
     * 根据 id 查询指定员工信息
     * @param id 要查询的员工编号
     * @return 如果该员工存在，返回其信息，如不存在，返回 null
     * @throws Exception SQL 执行异常
     */
    Emp findById(Integer id) throws Exception;

    /**
     * 查询数据表全部记录，以集合的形式返回
     * @return 如果表中有数据，所有数据封装成 VO 对象之后以 List 形式返回
     * 若表为空，则 List 长度为 0
     * @throws Exception SQL 执行异常
     */
    List<Emp> findAll() throws Exception;

    /**
     * 分页进行数据的模糊查询，结果以集合形式返回
     * @param currentPage 当前所在页
     * @param LineSize 每页显示的数据行数
     * @param column 要进行模糊查询的数据列
     * @param keyword 模糊查询关键字
     * @return 如果表中有数据，所有数据封装成 VO 对象之后以 List 形式返回
     * 若表为空，则 List 长度为 0
     * @throws Exception SQL 执行异常
     */
    List<Emp> findAllSplit(Integer currentPage, Integer LineSize, String column, String keyword) throws Exception;

    /**
     * 模糊查询数据量统计
     * @param column 要进行模糊查询的数据列
     * @param keyword 模糊查询关键字
     * @return 返回查询的得到的数据量，没有查到返回 0
     * @throws Exception SQL 执行异常
     */
    Integer getAllCount(String column, String keyword) throws Exception;
}
