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
    public Connection getConnection() {
        try {
            Log.d(TAG, "Database is connected");
            return JDBCUtil.getInstance().getConnection();
        } catch (Exception e) {
            Log.e(TAG, "Database connection error: " + e.getMessage());
            return null;
        }
    }

    // 获取数据库中用户
    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            if (connection == null) {
                Log.d(TAG, "connection is null");
                return userList;
            }

            // sql = "select * from 表";
            String sql = "select * from word";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // 注意与数据库字段一一对应
                String usr = resultSet.getString("username");
                String pwd = resultSet.getString("password");

                User user = new User();
                user.setUsername(usr);
                user.setPassword(pwd);
                userList.add(user);

                Log.d(TAG, "Fetched User - Username: " + usr);
            }
        } catch (Exception e) {
            Log.e("jdbc", "Error fetching users: " + e.getMessage());
        } finally {
            closeResources(resultSet, preparedStatement, connection);
        }
        return userList;
    }

    // 增添数据库新用户
    public boolean setUsers(String username, String password){

        Connection connection = null;
        PreparedStatement checkStatement = null;
        PreparedStatement insertStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            if (connection == null) return false;

            // 检查是否重名
            String checkSql = "SELECT COUNT(*) FROM word WHERE username = ?";
            checkStatement = connection.prepareStatement(checkSql);
            checkStatement.setString(1, username);
            resultSet = checkStatement.executeQuery();
            resultSet.next();

            if (resultSet.getInt(1) > 0) {
                Log.e(TAG, "Username already exists: " + username);
                return false;
            }

            // 插入新用户
            // sql = "select * from 表";
            String insertSql = "INSERT INTO word (username, password) VALUES (?, ?)";
            insertStatement = connection.prepareStatement(insertSql);
            insertStatement.setString(1, username);
            insertStatement.setString(2, password);

            int rowsAffected = insertStatement.executeUpdate();
            return rowsAffected > 0; // 插入成功则返回true

        } catch (Exception e) {
            Log.e("jdbc", "Error adding user: " + e.getMessage());
            return false;
        } finally {
            closeResources(resultSet, checkStatement, null);
            closeResources(null, insertStatement, connection);
        }
    }

    // 关闭与数据库的连接
    private void closeResources(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
//            if (connection != null) connection.close();
        } catch (Exception e) {
            Log.e(TAG, "Error closing resources: " + e.getMessage());
        }
    }

    public void closConnection() {
        Connection connection = null;

        try {
            connection = getConnection();
            if (connection == null) {
                Log.d(TAG, "connection is null");
            } else {
                try {
                    connection.close();
                    Log.d(TAG, "connection is closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}