package chapter14.e14_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class BatchTest {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "1024";

    public static void main(String[] args) {
        Connection conn;
        try {
            Class.forName(JDBC_DRIVER);
            // 连接数据库
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(conn);
            System.out.println("连接数据库成功");
            Statement state = conn.createStatement();
            // 取消自动提交
            conn.setAutoCommit(false);
            try {
                state.addBatch("INSERT INTO mem(name, birthday, age) VALUE ('A', '1990-01-01', 29)");
                state.addBatch("INSERT INTO mem(name, birthday, age) VALUE ('B', '1990-01-01', 29)");
                state.addBatch("INSERT INTO mem(name, birthday, age) VALUE ('C', '1990-01-01', 29)");
                state.addBatch("INSERT INTO mem(name, birthday, age) VALUE ('D', '1990-01-01', 29)");
                int[] result = state.executeBatch();
                System.out.println(Arrays.toString(result));
                // 无错误，提交
                conn.commit();
            } catch (Exception e) {
                e.printStackTrace();
                // 产生异常，回滚
                conn.rollback();
            }
            // 关闭连接
            state.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
