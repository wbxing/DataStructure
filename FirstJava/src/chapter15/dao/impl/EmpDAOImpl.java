package chapter15.dao.impl;

import chapter15.dao.IEmpDAO;
import chapter15.vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * emp 表的具体实现子类
 */
public class EmpDAOImpl implements IEmpDAO {
    private Connection conn;
    private PreparedStatement pstmt;

    /**
     * 要使用数据层进行原子性事务操作实现，必须提供和 Connection 接口实现对象
     * 开发之中由于业务层调用数据层，所以数据库的打开与关闭操作交由业务层处理
     * @param conn 数据库连接对象
     */
    public EmpDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Emp vo) throws Exception {
        String sql = "INSERT INTO emp(empno, ename, job, hiredate, salary, comm) VALUEs(?, ?, ?, ?, ?, ?)";

        this.pstmt = this.conn.prepareStatement(sql);

        this.pstmt.setInt(1, vo.getEmpNo());
        this.pstmt.setString(2, vo.getEmpName());
        this.pstmt.setString(3, vo.getJob());
        // 将 java.util.Date 类对象转换为 java.sql.Date 类对象
        this.pstmt.setDate(4, new java.sql.Date(vo.getHireDate().getTime()));
        this.pstmt.setDouble(5, vo.getSalary());
        this.pstmt.setDouble(6, vo.getComm());

        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean doUpdate(Emp vo) throws Exception {
        String sql = "UPDATE emp SET ename = ?, job = ?, hiredate = ?, salary = ?, comm = ? WHERE empno = ?";

        this.pstmt = this.conn.prepareStatement(sql);

        this.pstmt.setString(1, vo.getEmpName());
        this.pstmt.setString(2, vo.getJob());
        // 将 java.util.Date 类对象转换为 java.sql.Date 类对象
        this.pstmt.setDate(3, new java.sql.Date(vo.getHireDate().getTime()));
        this.pstmt.setDouble(4, vo.getSalary());
        this.pstmt.setDouble(5, vo.getComm());
        this.pstmt.setInt(6, vo.getEmpNo());

        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean removeBatch(Set<Integer> ids) throws Exception {
        // 拼凑 sql
        StringBuffer sql = new StringBuffer();
        sql.append("DELETE FROM emp WHERE empno IN (");
        Iterator<Integer> iter = ids.iterator();
        while (iter.hasNext()) {
            sql.append(iter.next()).append(", ");
        }
        sql.delete(sql.length() - 1, sql.length()).append(")");

        this.pstmt = this.conn.prepareStatement(sql.toString());

        return this.pstmt.executeUpdate() == ids.size();
    }

    @Override
    public Emp findById(Integer id) throws Exception {
        Emp vo = null;
        String sql = "SELECT empno, ename, hiredate, job, salary, comm FROM emp WHERE empno = ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, id);
        ResultSet results = this.pstmt.executeQuery();
        if (results.next()) {
            vo = setResultSet(results, new Emp());
        }
        return vo;
    }

    private Emp setResultSet(ResultSet temp, Emp vo) throws Exception {
        vo.setEmpNo(temp.getInt(1));
        vo.setEmpName(temp.getString(2));
        vo.setHireDate(temp.getDate(3));
        vo.setJob(temp.getString(4));
        vo.setSalary(temp.getDouble(5));
        vo.setComm(temp.getDouble(6));
        return vo;
    }

    @Override
    public List<Emp> findAll() throws Exception {
        List<Emp> list = new ArrayList<>();
        String sql = "SELECT empno, ename, hiredate, job, salary, comm FROM emp";
        this.pstmt = this.conn.prepareStatement(sql);
        ResultSet results = this.pstmt.executeQuery();
        if (results.next()) {
            Emp vo = setResultSet(results, new Emp());
            list.add(vo);
        }
        return list;
    }

    @Override
    public List<Emp> findAllSplit(Integer currentPage, Integer LineSize, String column, String keyword) throws Exception {
        List<Emp> list = new ArrayList<>();
        String sql = " SELECT * FROM emp " +
                " WHERE " + column + " LIKE ? " +
                "LIMIT ?, ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, "%" + keyword + "%");
        this.pstmt.setInt(2, (currentPage -1) * 10);
        this.pstmt.setInt(3, LineSize);

        ResultSet results = this.pstmt.executeQuery();

        if (results.next()) {
            Emp vo = setResultSet(results, new Emp());
            list.add(vo);
        }
        return list;
    }

    @Override
    public Integer getAllCount(String column, String keyword) throws Exception {
        String sql = "SELECT COUNT(empno) FROM emp WHERE " + column + " LIKE ? ";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, "%" + keyword + "%");

        ResultSet results = this.pstmt.executeQuery();
        if (results.next()) {
            return results.getInt(1);
        }
        return 0;
    }
}
