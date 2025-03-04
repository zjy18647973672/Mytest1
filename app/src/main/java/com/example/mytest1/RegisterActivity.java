package com.example.mytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "RegisterActivity";
    private Button btn_register;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register = findViewById(R.id.btn_register);
        btn_back = findViewById(R.id.btn_back);

        btn_register.setOnClickListener(this);
        btn_back.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_register) {
            Log.d(TAG, "*** ... is clicked ***");
            login(v);
        }
        if (v.getId() == R.id.btn_back) {
            Log.d(TAG, "*** ... is clicked ***");
            Intent intent=new Intent(RegisterActivity.this, LogOnActivity.class);
            startActivityForResult(intent,1);//返回请求结果，请求码为1

            finish();

        }
    }

    public void login(View view){
        new Thread(){
            @Override
            public void run() {
                UserDao userDao = new UserDao();
                userDao.test();
            }
        }.start();
    }

}
