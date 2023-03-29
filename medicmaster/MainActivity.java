package com.example.medicmaster;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = (CardView) findViewById(R.id.hosp);
        card1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in;
                in = new Intent(MainActivity.this, ListActivity.class);
                startActivity(in);

            }

        });
        card2 = (CardView) findViewById(R.id.bld);
        card2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in;
                in = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(in);
            }

        });

        card3 = (CardView) findViewById(R.id.mri);
        card3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in;
                in = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(in);
            }

        });

        card4 = (CardView) findViewById(R.id.dia);
        card4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in;
                in = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(in);
            }

        });
    }
}