package chapter15.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 负责数据库的连接与关闭操作
 *
 */
public class DBConnection {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/first_java?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1024";
    private Connection conn = null;

    public DBConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            this.conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 取得一个实例化连接对象
     * @return Connection 实例化对象
     */
    public Connection getConnection() {
        return this.conn;
    }

    /**
     * 关闭数据库
     */
    public void close() {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
