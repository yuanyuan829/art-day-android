package com.yeah.y17611630829.art;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class score extends AppCompatActivity {

    Button Buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        //定位按钮
        Buttonback= (Button) findViewById(R.id.Buttonback);

        //添加监听器
        Buttonback.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(score.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
