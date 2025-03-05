package com.example.mytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class LogOnActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "LogOnActivity";

    private EditText et_account;
    private EditText et_password;
    private CheckBox btn_remember;
    private TextView btn_go_register;
    private Button btn_log_on;

    private List<User> mUserList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_on);

        et_account = findViewById(R.id.et_account);
        et_password = findViewById(R.id.et_password);
        btn_remember = findViewById(R.id.btn_remember);
        btn_go_register = findViewById(R.id.btn_go_register);
        btn_log_on = findViewById(R.id.btn_log_on);

        btn_remember.setOnClickListener(this);
        btn_go_register.setOnClickListener(this);
        btn_log_on.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_remember) {
            Log.d(TAG, "*** ... is clicked ***");

        }
        if (v.getId() == R.id.btn_go_register) {
            Log.d(TAG, "*** ... is clicked ***");
            Intent intent=new Intent(LogOnActivity.this, RegisterActivity.class);
            startActivityForResult(intent,1);//返回请求结果，请求码为1
            finish();

        }
        if (v.getId() == R.id.btn_log_on) {
            Log.d(TAG, "*** ... is clicked ***");

            // 加载数据库
            logon(v);

            // 注册信息检查
            if(isUsernameLegal() && isPasswordLegal()) {
                Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
            }

            Intent intent=new Intent(LogOnActivity.this, MainActivity.class);
            startActivityForResult(intent,1);//返回请求结果，请求码为1
            finish();
        }

    }


    public void logon(View view){
        new Thread(){
            @Override
            public void run() {
                UserDao userDao = new UserDao();
                userDao.getConnection();
                mUserList = userDao.getUsers();
//                userDao.admin();
            }
        }.start();
    }

    // 检查用户名是否合法
    public boolean isUsernameLegal() {
        if (et_account == null) {
            Toast.makeText(this, "请输入账号", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            for (User user : mUserList) {
                // 检索数据库中是否有用户名与当前editView中用户名重复
                if (user.getUsername().equals(et_account.getText().toString())) {
                    Toast.makeText(this, "该账号已注册，请换一个用户名", Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "username already exist!");
                    return false;
                }
            }
            return true;
        }
    }

    // 检查密码是否合理
    public boolean isPasswordLegal() {
        if (et_password == null) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
