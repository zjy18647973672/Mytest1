package com.example.mytest1;

import android.util.Log;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private static final String TAG = "UserDao";

    public void getUsers(){

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
                // 处理每一行数据，您可以根据需求进行相应的操作
                Log.d(TAG, "Id: " + Id);
                Log.d(TAG, "username: " + usr);
                Log.d(TAG, "password: " + pwd);
            }
        } catch (Exception e) {
            System.out.println(e);
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
    }
}