package com.example.rps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rock, gwen, paper;
    ImageView emberv, gepv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paper = (Button) findViewById(R.id.paper);
        rock = (Button) findViewById(R.id.rock);
        gwen = (Button) findViewById(R.id.gwen);

        gepv = (ImageView) findViewById(R.id.gepv);
        emberv = (ImageView) findViewById(R.id.emberv);

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emberv.setImageResource(R.drawable.paper);
                play_turn("paper");
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emberv.setImageResource(R.drawable.rock);
                play_turn("rock");

            }
        });

        gwen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emberv.setImageResource(R.drawable.scissors);
                play_turn("gwen");

            }
        });

        public void play_turn(String emberv) {
            String gepv = "";
            Random r = new Random();
        }

    }
}