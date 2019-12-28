package chapter14.e14_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1024";

    public static void main(String[] args) {
//        String name = "SMITH";
//        Date birthday = new Date();
//        int age = 30;

        Connection conn;
        PreparedStatement pstmt;

        try {
            Class.forName(JDBC_DRIVER);
            // 连接数据库
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            System.out.println("连接成功");
            String sql;
//            sql = "INSERT INTO mem(name, birthday, age) VALUES(?, ?, ?)";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, name);
//            pstmt.setDate(2, new java.sql.Date(birthday.getTime()));
//            pstmt.setInt(3, age);
//            int len = pstmt.executeUpdate();
//            System.out.println("影响的数据行：" + len);
            // 查询全部数据
//            sql = "SELECT id, name, birthday, age FROM mem ORDER BY id";
            // 模糊查询
//            // 设置关键字
//            String keywords = "S";
//            sql = "SELECT id, name, birthday, age FROM mem WHERE name LIKE ?";

            // 统计数据量
            // 不设关键字
            String keywords = "";
            sql = "SELECT COUNT(id) FROM mem WHERE name LIKE ?";
            pstmt = conn.prepareStatement(sql);
            // 设置查询关键字
            pstmt.setString(1, "%" + keywords + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
//                int id = rs.getInt(1);
//                String name = rs.getString(2);
//                Date birthday = rs.getDate(3);
//                int age = rs.getInt(4);
//                System.out.println(id + ", " + name + ", " + birthday + ", " + age);
                int count = rs.getInt(1);
                System.out.println("数据记录数：" + count);
            }

            // 关闭连接
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
