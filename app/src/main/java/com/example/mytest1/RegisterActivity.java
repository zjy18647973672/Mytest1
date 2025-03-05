package com.example.mytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "RegisterActivity";
    private Button btn_register;
    private Button btn_back;
    private EditText et_account;
    private EditText et_password;

    private UserDao userDao;
    private List<User> userList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register = findViewById(R.id.btn_register);
        btn_back = findViewById(R.id.btn_back);
        et_account = findViewById(R.id.et_account);
        et_password = findViewById(R.id.et_password);


        btn_register.setOnClickListener(this);
        btn_back.setOnClickListener(this);

        // 初始化数据库权限
        userDao = new UserDao();

        // 加载用户列表
        loadUserList();
    }

    // 加载用户列表
    private void loadUserList() {
        new Thread(() -> {
            userList = userDao.getUsers();
        }).start();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_register) {
            Log.d(TAG, "*** Register button clicked ***");

            // 输入数据合理化
            String username = et_account.getText().toString().trim();
            String password = et_password.getText().toString().trim();

            // 注册信息检查
            if(!isUsernameLegal(username) || !isPasswordLegal(password)) {
//                UserDao userDao = new UserDao();
//                userDao.getConnection();
//
//                userDao.setUsers(et_account.getText().toString(), et_password.getText().toString());
//                Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();

                return;
            }

            // 在线程中注册用户
            new Thread(() -> {
                boolean success = userDao.setUsers(username, password);

                // 注册后更新界面显示
                runOnUiThread(() -> {
                    if (success) {
                        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(this, LogOnActivity.class));
                        finish();
                        userDao.closConnection();
                    } else {
                        Toast.makeText(this, "注册失败，请重试", Toast.LENGTH_SHORT).show();
                    }
                });
            }).start();
        }

        if (v.getId() == R.id.btn_back) {
            Log.d(TAG, "*** Back button clicked ***");
            Intent intent=new Intent(RegisterActivity.this, LogOnActivity.class);
            startActivityForResult(intent,1);//返回请求结果，请求码为1

            userDao.closConnection();
//
//            UserDao userDao = new UserDao();
//            userDao.getConnection();
//
//            userDao.closeConnection();
            finish();

        }
    }
//
//    public void register(View view){
//        new Thread(){
//            @Override
//            public void run() {
//                UserDao userDao = new UserDao();
//                userDao.getConnection();
//                mUserList = userDao.getUsers();
//            }
//        }.start();
//    }


    // 检查用户名是否合法
    public boolean isUsernameLegal(String username) {
        if (username.isEmpty()) {
            Toast.makeText(this, "请输入账号", Toast.LENGTH_SHORT).show();
            return false;
        }

        for (User user : userList) {
            // 检索数据库中是否有用户名与当前editView中用户名重复
            if (user.getUsername().equals(username)) {
                Toast.makeText(this, "该账号已注册，请换一个用户名", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "username already exist!");
                return false;
            }
        }
        return true;
    }

    // 检查密码是否合理
    public boolean isPasswordLegal(String password) {
        if (password.isEmpty()) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

}
