package chapter14.e14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestStatement {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1024";

    public static void main(String[] args) {
        String name = "SMITH";
        String birthday = "1990-01-01";
        int age = 30;

        Connection conn;
        Statement stmt;
        try {
            Class.forName(JDBC_DRIVER);
            // 连接数据库
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            System.out.println("连接成功");
            stmt = conn.createStatement();
            String sql;
            // 拼凑形成的 SQL 语句比较混乱
            sql = "INSERT INTO mem(name, birthday, age) VALUES('" + name + "', '" + birthday + "', " + age + ")";
            System.out.println(sql);
            int len = stmt.executeUpdate(sql);
            System.out.println("影响的数据行：" + len);

            // 关闭连接
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
