package com.gyanendra.diceroller;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView bt;
    private ImageView bt2;
    private Random myrandom =new Random();
    private TextView txt;
    private TextView txt2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.imageView1);
        bt2=findViewById(R.id.imageView2);
        txt=findViewById(R.id.textView1);
        txt2=findViewById(R.id.textView2);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myRanNumber= myrandom.nextInt(6)+1;
                switch (myRanNumber){
                        case 1:
                        bt.setImageResource(R.drawable.dice1);
                        txt.setText("one");
                        break;
                        case 2:
                        bt.setImageResource(R.drawable.dice2);
                            txt.setText("two");
                        break;
                        case 3:
                        bt.setImageResource(R.drawable.dice3);
                            txt.setText("three");
                        break;
                        case 4:
                        bt.setImageResource(R.drawable.dice4);
                            txt.setText("four");
                        break;
                        case 5:
                        bt.setImageResource(R.drawable.dice5);
                            txt.setText("five");
                        break;
                        case 6:
                        bt.setImageResource(R.drawable.dice6);
                            txt.setText("six");
                        break;
                }


                int myRanNumber2= myrandom.nextInt(6)+1;
                switch (myRanNumber2){
                    case 1:
                        bt2.setImageResource(R.drawable.dice1);
                        txt2.setText("one");
                        break;
                    case 2:
                        bt2.setImageResource(R.drawable.dice2);
                        txt2.setText("two");
                        break;
                    case 3:
                        bt2.setImageResource(R.drawable.dice3);
                        txt2.setText("three");
                        break;
                    case 4:
                        bt2.setImageResource(R.drawable.dice4);
                        txt2.setText("four");
                        break;
                    case 5:
                        bt2.setImageResource(R.drawable.dice5);
                        txt2.setText("five");
                        break;
                    case 6:
                        bt2.setImageResource(R.drawable.dice6);
                        txt2.setText("six");
                        break;
                }
            }
        });


    }
}