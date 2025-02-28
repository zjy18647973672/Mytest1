package com.example.mytest1;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivity";

    private Button mbtn_y1;
    private Button mbtn_y2;
    private Button mbtn_n1;
    private Button mbtn_n2;
    private Button mbtn_y3;
    private Button mbtn_y4;
    private Button mbtn_n3;
    private Button mbtn_n4;
    private Button mbtn_y5;
    private Button mbtn_y6;
    private Button mbtn_n5;
    private Button mbtn_n6;
    private Button mbtn_y7;
    private Button mbtn_y8;
    private Button mbtn_n7;
    private Button mbtn_n8;
    private int is1clicked = 0;
    private int is2clicked = 0;
    private int is3clicked = 0;
    private int is4clicked = 0;
    private int is5clicked = 0;
    private int is6clicked = 0;
    private int is7clicked = 0;
    private int is8clicked = 0;
    private TextView mtv1;


    private Thread mThread;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv1 = findViewById(R.id.word1);
        mtv1.setText("apple");

        mbtn_y1 = findViewById(R.id.btn_y1);
        mbtn_y1.setOnClickListener(this);

        mbtn_y2 = findViewById(R.id.btn_y2);
        mbtn_y2.setOnClickListener(this);

        mbtn_n1 = findViewById(R.id.btn_n1);
        mbtn_n1.setOnClickListener(this);

        mbtn_n2 = findViewById(R.id.btn_n2);
        mbtn_n2.setOnClickListener(this);

        mbtn_y3 = findViewById(R.id.btn_y3);
        mbtn_y3.setOnClickListener(this);

        mbtn_y4 = findViewById(R.id.btn_y4);
        mbtn_y4.setOnClickListener(this);

        mbtn_n3 = findViewById(R.id.btn_n3);
        mbtn_n3.setOnClickListener(this);

        mbtn_n4 = findViewById(R.id.btn_n4);
        mbtn_n4.setOnClickListener(this);

        mbtn_y5 = findViewById(R.id.btn_y5);
        mbtn_y5.setOnClickListener(this);

        mbtn_y6 = findViewById(R.id.btn_y6);
        mbtn_y6.setOnClickListener(this);

        mbtn_n5 = findViewById(R.id.btn_n5);
        mbtn_n5.setOnClickListener(this);

        mbtn_n6 = findViewById(R.id.btn_n6);
        mbtn_n6.setOnClickListener(this);

        mbtn_y7 = findViewById(R.id.btn_y7);
        mbtn_y7.setOnClickListener(this);

        mbtn_y8 = findViewById(R.id.btn_y8);
        mbtn_y8.setOnClickListener(this);

        mbtn_n7 = findViewById(R.id.btn_n7);
        mbtn_n7.setOnClickListener(this);

        mbtn_n8 = findViewById(R.id.btn_n8);
        mbtn_n8.setOnClickListener(this);

        mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Capture();
            }
        });
        mThread.setDaemon(true); // 设置为守护线程
        mThread.start();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_y1) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is1clicked == 1) {
                mbtn_n1.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y1.setBackgroundColor(Color.parseColor("#FF4081"));
            is1clicked = 1;
        }
        if (v.getId() == R.id.btn_n1) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is1clicked == 1) {
                mbtn_y1.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n1.setBackgroundColor(Color.parseColor("#FF4081"));
            is1clicked = 1;
        }
        if (v.getId() == R.id.btn_y2) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is2clicked == 1) {
                mbtn_n2.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y2.setBackgroundColor(Color.parseColor("#FF4081"));
            is2clicked = 1;
        }
        if (v.getId() == R.id.btn_n2) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is2clicked == 1) {
                mbtn_y2.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n2.setBackgroundColor(Color.parseColor("#FF4081"));
            is2clicked = 1;
        }
        if (v.getId() == R.id.btn_y3) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is3clicked == 1) {
                mbtn_n3.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y3.setBackgroundColor(Color.parseColor("#FF4081"));
            is3clicked = 1;
        }
        if (v.getId() == R.id.btn_n3) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is3clicked == 1) {
                mbtn_y3.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n3.setBackgroundColor(Color.parseColor("#FF4081"));
            is3clicked = 1;
        }
        if (v.getId() == R.id.btn_y4) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is4clicked == 1) {
                mbtn_n4.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y4.setBackgroundColor(Color.parseColor("#FF4081"));
            is4clicked = 1;
        }
        if (v.getId() == R.id.btn_n4) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is4clicked == 1) {
                mbtn_y4.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n4.setBackgroundColor(Color.parseColor("#FF4081"));
            is4clicked = 1;
        }
        if (v.getId() == R.id.btn_y5) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is5clicked == 1) {
                mbtn_n5.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y5.setBackgroundColor(Color.parseColor("#FF4081"));
            is5clicked = 1;
        }
        if (v.getId() == R.id.btn_n5) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is5clicked == 1) {
                mbtn_y5.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n5.setBackgroundColor(Color.parseColor("#FF4081"));
            is5clicked = 1;
        }
        if (v.getId() == R.id.btn_y6) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is6clicked == 1) {
                mbtn_n6.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y6.setBackgroundColor(Color.parseColor("#FF4081"));
            is6clicked = 1;
        }
        if (v.getId() == R.id.btn_n6) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is6clicked == 1) {
                mbtn_y6.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n6.setBackgroundColor(Color.parseColor("#FF4081"));
            is6clicked = 1;
        }
        if (v.getId() == R.id.btn_y7) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is7clicked == 1) {
                mbtn_n7.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y7.setBackgroundColor(Color.parseColor("#FF4081"));
            is7clicked = 1;
        }
        if (v.getId() == R.id.btn_n7) {
            Log.d(TAG,"*** button7 is clicked ***");
            if(is7clicked == 1) {
                mbtn_y7.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n7.setBackgroundColor(Color.parseColor("#FF4081"));
            is7clicked = 1;
        }
        if (v.getId() == R.id.btn_y8) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is8clicked == 1) {
                mbtn_n8.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y8.setBackgroundColor(Color.parseColor("#FF4081"));
            is8clicked = 1;
        }
        if (v.getId() == R.id.btn_n8) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is8clicked == 1) {
                mbtn_y8.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n8.setBackgroundColor(Color.parseColor("#FF4081"));
            is8clicked = 1;
        }

    }

    private void Capture() {
        while(true) {
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1) {
                mbtn_y1.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n1.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y2.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n2.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y3.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n3.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y4.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n4.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y5.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n5.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y6.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n6.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y7.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n7.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_y8.setBackgroundColor(Color.parseColor("#0FFFFF"));
                mbtn_n8.setBackgroundColor(Color.parseColor("#0FFFFF"));
                is1clicked = 0;
                is2clicked = 0;
                is3clicked = 0;
                is4clicked = 0;
                is5clicked = 0;
                is6clicked = 0;
                is7clicked = 0;
                is8clicked = 0;
//                if (mtv1 != null) {
//                    mtv1.setText("Hello, World!");
//                } else {
//                    Log.e("Error", "TextView is null");
//                }
            }
        }
    }


}