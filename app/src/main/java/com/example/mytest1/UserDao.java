package com.example.mytest1;

import android.util.Log;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    public void test(){
        try {
            Connection connection = JDBCUtil.getInstance().getConnection();
            // sql = "select * from 表";
            String sql = "select * from word";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // 注意与数据库字段一一对应
                int userId = resultSet.getInt("user_id");
                String usr = resultSet.getString("username");
                String pwd = resultSet.getString("password");
                String role = resultSet.getString("role");
                // 处理每一行数据，您可以根据需求进行相应的操作
                System.out.println("user: " + userId);
                System.out.println("username: " + usr);
                System.out.println("password: " + pwd);
                System.out.println("role: " + role);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e);
            Log.e("jdbc",e.getMessage());
        }
    }
}