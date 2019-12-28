package chapter14.e14_1;

import java.sql.*;

// 数据库连接
public class TestMysql {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1024";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        try {
            Class.forName(JDBC_DRIVER);
            // 连接数据库
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // 执行查询
            System.out.println(conn);
            System.out.println("连接成功");
            // Statement 接口
            stmt = conn.createStatement();
            String sql;
//            // 插入数据
//            sql = "INSERT INTO mem(name, birthday, age) VALUES('qian', '1999-11-01', 20)";

//            // 修改数据
//            sql = "UPDATE mem SET name='wang', birthday='1990-02-23', age=30 WHERE id IN(1, 2, 3)";

            // 删除数据
//            sql = "DELETE FROM mem WHERE id IN(1, 2, 3, 6)";
//            int len = stmt.executeUpdate(sql);

            // 查询数据
            sql = "SELECT id, name, birthday, age FROM mem";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
//                int id = rs.getInt("id");
////                String name = rs.getString("name");
////                Date birthday = rs.getDate("birthday");
////                int age = rs.getInt("age");
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Date birthday = rs.getDate(3);
                int age = rs.getInt(4);
                System.out.println("id : " + id + ", name : " + name + ", birthday : " + birthday + ", age : " + age);
            }
            // int len = stmt.executeUpdate(sql);
            // System.out.println("影响的数据行：" + len);
            // 完成后关闭
            stmt.close();
            conn.close();

        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
    }
}
