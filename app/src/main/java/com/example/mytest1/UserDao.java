package com.example.mytest1;

import android.util.Log;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private Connection mConnection;
    private static final String TAG = "UserDao";

    // 数据库初始化，即建立与数据库的连接
    public void getConnection() {
        if (mConnection == null) {
            try {
                mConnection = JDBCUtil.getInstance().getConnection();
            } catch (Exception e) {
                Log.e("jdbc", "Database connection error: " + e.getMessage());
            }
        }
    }

    // 获取数据库中用户
    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            // sql = "select * from 表";
            String sql = "select * from word";
            preparedStatement = mConnection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // 注意与数据库字段一一对应
                String usr = resultSet.getString("username");
                String pwd = resultSet.getString("password");

                User user = new User();
                user.setUsername(usr);
                user.setPassword(pwd);
                userList.add(user);

                // 处理每一行数据，您可以根据需求进行相应的操作
                Log.d(TAG, "username: " + usr + " " + user.getUsername());
                Log.d(TAG, "password: " + pwd + " " + user.getPassword());
            }
        } catch (Exception e) {
            Log.e("jdbc", "Error fetching users: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (Exception e) {
                Log.e("jdbc", "Error closing connection: " + e.getMessage());
            }
        }
        return userList;
    }

    // 增添数据库新用户
    public void setUsers(String username, String password){

        PreparedStatement preparedStatement = null;

        try {

            // sql = "select * from 表";
            String sql = "INSERT INTO word (username, password) VALUES (?, ?)";
            preparedStatement = mConnection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            int rowsAffected = preparedStatement.executeUpdate();
            if( rowsAffected > 0) {
                Log.d(TAG, "at least one row was inserted");
            }

        } catch (Exception e) {
            Log.e("jdbc", "Error adding user: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (Exception e) {
                Log.e("jdbc", "Error closing connection: " + e.getMessage());
            }
        }
    }

    // 关闭与数据库的连接
    public void closeConnection() {
        try {
            if (mConnection != null) mConnection.close();
        } catch (Exception e) {
            Log.e("jdbc", "Error closing connection: " + e.getMessage());
        }
    }

}