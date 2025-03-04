package com.example.mytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogOnActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "LogOnActivity";

    private EditText et_account;
    private EditText et_password;
    private CheckBox btn_remember;
    private TextView btn_go_register;
    private Button btn_log_on;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_on);

        et_account = findViewById(R.id.et_account);
        et_password = findViewById(R.id.et_password);
        btn_remember = findViewById(R.id.btn_remember);
        btn_go_register = findViewById(R.id.btn_go_register);
        btn_log_on = findViewById(R.id.btn_log_on);

        et_account.setOnClickListener(this);
        et_password.setOnClickListener(this);
        btn_remember.setOnClickListener(this);
        btn_go_register.setOnClickListener(this);
        btn_log_on.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.et_account) {
            Log.d(TAG, "*** ... is clicked ***");
        }
        if (v.getId() == R.id.et_password) {
            Log.d(TAG, "*** ... is clicked ***");
        }
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
            login(v);

            Intent intent=new Intent(LogOnActivity.this, MainActivity.class);
            startActivityForResult(intent,1);//返回请求结果，请求码为1
            finish();
        }

    }


    public void login(View view){
        new Thread(){
            @Override
            public void run() {
                UserDao userDao = new UserDao();
                userDao.getUsers();
            }
        }.start();
    }


}
