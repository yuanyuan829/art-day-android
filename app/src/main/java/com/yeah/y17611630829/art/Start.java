package com.yeah.y17611630829.art;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    Button Main_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //定位按钮
        Main_start= (Button) findViewById(R.id.Main_start);

        //添加监听器
        Main_start.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Start.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
