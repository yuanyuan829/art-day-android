package com.yeah.y17611630829.art;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yeah.y17611630829.art.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    Button about;
    Button login;
    Button score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //定位按钮
        about= (Button) findViewById(R.id.about);

        //添加监听器
        about.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
        //定位按钮
        login= (Button) findViewById(R.id.login);

        //添加监听器
        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        //定位按钮
        score= (Button) findViewById(R.id.score);

        //添加监听器
        score.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, score.class);
                startActivity(intent);
            }
        });
    }
}
