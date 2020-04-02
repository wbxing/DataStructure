package com.bs.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接工具类
 */
public class JdbcUtils {

    private static DataSource dataSource;

    static {
        try {
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();

            properties.load(is);

            // 创建数据库连接池
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池里的连接
     *
     * @return 返回一个数据库连接，如果返回 null，说明获取数据库连接失败
     */
    public static Connection getConnection() {

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
