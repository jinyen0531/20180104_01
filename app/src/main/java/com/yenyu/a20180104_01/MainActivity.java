package com.yenyu.a20180104_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //TextView tv= new TextView(this);
        //tv.setText("hi the world");

        Button bt=new Button(this);
        bt.setText("CLick me!!!!!!!");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"CLICK!!!",Toast.LENGTH_SHORT).show();
            }
        });
        Button bt2=new Button(this);
        bt2.setText("CLick me 222");
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"CLICK 222!!!",Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout layout= new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(bt);
        layout.addView(bt2);


        setContentView(layout);
        //setContentView 為Overloading
        //其中一個為setContentView(View v)
        // -> TextView 為 View 的子類別 故可以直接放裡面
        // -> Button 為 TextView 的子類別
    }
}
