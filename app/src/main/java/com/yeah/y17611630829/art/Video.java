package com.yeah.y17611630829.art;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.Button;

public class Video extends AppCompatActivity {

    Button textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Shader shader = new LinearGradient(0, 0, 0, textView5.getLineHeight(),
                Color.RED, Color.BLUE, Shader.TileMode.REPEAT);
        textView5.getPaint().setShader(shader);
        textView5.setText("哈喽，benio\n哈喽，benio\n哈喽，benio");
    }
}