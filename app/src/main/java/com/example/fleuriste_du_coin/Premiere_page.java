package com.example.fleuriste_du_coin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Premiere_page extends AppCompatActivity {


    private static final int time=500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premiere_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Premiere_page.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },time);
    }
}