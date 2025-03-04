package com.example.mytest1;

import android.util.Log;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final String TAG = "UserDao";

    // 数据库初始化，即建立与数据库的连接
    public void getConnection() {
        Connection connection = null;
        try {
            connection = JDBCUtil.getInstance().getConnection();
        } catch (Exception e) {
            Log.e("jdbc", "Database connection error: " + e.getMessage());
        }
    }

    // 获取数据库中用户
    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtil.getInstance().getConnection();
            // sql = "select * from 表";
            String sql = "select * from word";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // 注意与数据库字段一一对应
                int Id = resultSet.getInt("id");
                String usr = resultSet.getString("username");
                String pwd = resultSet.getString("password");

                User user = new User();
                user.setId(Id);
                user.setUsername(usr);
                user.setPassword(pwd);
                userList.add(user);

                // 处理每一行数据，您可以根据需求进行相应的操作
                Log.d(TAG, "Id: " + Id + " " + user.getId());
                Log.d(TAG, "username: " + usr + " " + user.getUsername());
                Log.d(TAG, "password: " + pwd + " " + user.getPassword());
            }
        } catch (Exception e) {
            Log.e("jdbc", "Error fetching users: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                Log.e("jdbc", "Error closing connection: " + e.getMessage());
            }
        }
        return userList;
    }
}