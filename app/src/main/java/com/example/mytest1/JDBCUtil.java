package com.example.mytest1;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCUtil {

    private static JDBCUtil jdbcUtil;
    private Connection connection;

    private JDBCUtil() {

    }

    public static JDBCUtil getInstance() {
        if(jdbcUtil == null) {
            jdbcUtil = new JDBCUtil();
        }
        return jdbcUtil;
    }

    public Connection getConnection() throws Exception {
        if(connection == null) {
            // 1、装载驱动
            // 注意这里采用的mysql5.1.49的驱动包，无需"com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.jdbc.Driver");
            // 2.定义连接url
            // url="jdbc:mysql://ip地址:3306/数据库名?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true"
            // ip地址为本机的IPV4地址，利用cmd输入ipconfig指令查寻
            String url="jdbc:mysql://192.168.43.159:3306/english?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
            // 3.定义账号和密码
            // 对应数据库用户名，注意同时需在数据库中赋予该用户权限
            String username="root2";
            String password="123456";
            //4.获得连接对象
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;

    }
}