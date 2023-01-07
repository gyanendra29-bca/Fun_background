package com.gyanendra.bgcolour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        btn=findViewById(R.id.imageButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int color= Color.argb(255,random.nextInt(223),random.nextInt(223),random.nextInt(223));
                layout.setBackgroundColor(color);
            }
        });

    }
}