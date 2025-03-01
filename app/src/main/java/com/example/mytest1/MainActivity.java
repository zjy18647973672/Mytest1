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
    private Button mbtn_y9;
    private Button mbtn_y0;
    private Button mbtn_n9;
    private Button mbtn_n0;
    private int is1clicked = 0;
    private int is2clicked = 0;
    private int is3clicked = 0;
    private int is4clicked = 0;
    private int is5clicked = 0;
    private int is6clicked = 0;
    private int is7clicked = 0;
    private int is8clicked = 0;
    private int is9clicked = 0;
    private int is0clicked = 0;

    private TextView mtv1;
    private TextView mtv2;
    private TextView mtv3;
    private TextView mtv4;
    private TextView mtv5;
    private TextView mtv6;
    private TextView mtv7;
    private TextView mtv8;
    private TextView mtv9;
    private TextView mtv0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv1 = findViewById(R.id.word1);
        mtv2 = findViewById(R.id.word2);
        mtv3 = findViewById(R.id.word3);
        mtv4 = findViewById(R.id.word4);
        mtv5 = findViewById(R.id.word5);
        mtv6 = findViewById(R.id.word6);
        mtv7 = findViewById(R.id.word7);
        mtv8 = findViewById(R.id.word8);
        mtv9 = findViewById(R.id.word9);
        mtv0 = findViewById(R.id.word0);

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

        mbtn_y9 = findViewById(R.id.btn_y9);
        mbtn_y9.setOnClickListener(this);

        mbtn_y0 = findViewById(R.id.btn_y0);
        mbtn_y0.setOnClickListener(this);

        mbtn_n9 = findViewById(R.id.btn_n9);
        mbtn_n9.setOnClickListener(this);

        mbtn_n0 = findViewById(R.id.btn_n0);
        mbtn_n0.setOnClickListener(this);

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
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n1) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is1clicked == 1) {
                mbtn_y1.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n1.setBackgroundColor(Color.parseColor("#FF4081"));
            is1clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y2) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is2clicked == 1) {
                mbtn_n2.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y2.setBackgroundColor(Color.parseColor("#FF4081"));
            is2clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n2) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is2clicked == 1) {
                mbtn_y2.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n2.setBackgroundColor(Color.parseColor("#FF4081"));
            is2clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y3) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is3clicked == 1) {
                mbtn_n3.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y3.setBackgroundColor(Color.parseColor("#FF4081"));
            is3clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n3) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is3clicked == 1) {
                mbtn_y3.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n3.setBackgroundColor(Color.parseColor("#FF4081"));
            is3clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y4) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is4clicked == 1) {
                mbtn_n4.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y4.setBackgroundColor(Color.parseColor("#FF4081"));
            is4clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n4) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is4clicked == 1) {
                mbtn_y4.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n4.setBackgroundColor(Color.parseColor("#FF4081"));
            is4clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y5) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is5clicked == 1) {
                mbtn_n5.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y5.setBackgroundColor(Color.parseColor("#FF4081"));
            is5clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n5) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is5clicked == 1) {
                mbtn_y5.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n5.setBackgroundColor(Color.parseColor("#FF4081"));
            is5clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y6) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is6clicked == 1) {
                mbtn_n6.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y6.setBackgroundColor(Color.parseColor("#FF4081"));
            is6clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n6) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is6clicked == 1) {
                mbtn_y6.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n6.setBackgroundColor(Color.parseColor("#FF4081"));
            is6clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y7) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is7clicked == 1) {
                mbtn_n7.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y7.setBackgroundColor(Color.parseColor("#FF4081"));
            is7clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n7) {
            Log.d(TAG,"*** button7 is clicked ***");
            if(is7clicked == 1) {
                mbtn_y7.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n7.setBackgroundColor(Color.parseColor("#FF4081"));
            is7clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y8) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is8clicked == 1) {
                mbtn_n8.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y8.setBackgroundColor(Color.parseColor("#FF4081"));
            is8clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n8) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is8clicked == 1) {
                mbtn_y8.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n8.setBackgroundColor(Color.parseColor("#FF4081"));
            is8clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y9) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is9clicked == 1) {
                mbtn_n9.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y9.setBackgroundColor(Color.parseColor("#FF4081"));
            is9clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n9) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is9clicked == 1) {
                mbtn_y9.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n9.setBackgroundColor(Color.parseColor("#FF4081"));
            is9clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_y0) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is0clicked == 1) {
                mbtn_n0.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_y0.setBackgroundColor(Color.parseColor("#FF4081"));
            is0clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }
        if (v.getId() == R.id.btn_n0) {
            Log.d(TAG,"*** button1 is clicked ***");
            if(is0clicked == 1) {
                mbtn_y0.setBackgroundColor(Color.parseColor("#0FFFFF"));
            }
            mbtn_n0.setBackgroundColor(Color.parseColor("#FF4081"));
            is0clicked = 1;
            if(is1clicked == 1 && is2clicked == 1 && is3clicked == 1 && is4clicked == 1 && is5clicked == 1 && is6clicked == 1 && is7clicked == 1 && is8clicked == 1 && is9clicked == 1 && is0clicked == 1) {
                Update();
            }
        }

    }


    /*
    * Update  翻页，更新页面中的单词
    * */
    private void Update() {
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
        mbtn_y9.setBackgroundColor(Color.parseColor("#0FFFFF"));
        mbtn_n9.setBackgroundColor(Color.parseColor("#0FFFFF"));
        mbtn_y0.setBackgroundColor(Color.parseColor("#0FFFFF"));
        mbtn_n0.setBackgroundColor(Color.parseColor("#0FFFFF"));

        is1clicked = 0;
        is2clicked = 0;
        is3clicked = 0;
        is4clicked = 0;
        is5clicked = 0;
        is6clicked = 0;
        is7clicked = 0;
        is8clicked = 0;
        is9clicked = 0;
        is0clicked = 0;

        //这里后面换成数据库的单词
        mtv1.setText("Apples");
        mtv2.setText("Banana");
        mtv3.setText("Cat");
        mtv4.setText("Dog");
        mtv5.setText("Eat");
        mtv6.setText("Fat");
        mtv7.setText("Google");
        mtv8.setText("Happy");
        mtv9.setText("I");
        mtv0.setText("Jam");
    }


}