package com.example.myscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aries = (Button) findViewById(R.id.aries);
        Button taurus = (Button) findViewById(R.id.taurus);
        Button gemini = (Button) findViewById(R.id.gemini);
        Button cancer = (Button) findViewById(R.id.cancer);
        Button leo = (Button) findViewById(R.id.leo);
        Button virgo = (Button) findViewById(R.id.virgo);
        Button scorpio = (Button) findViewById(R.id.scorpio);
        Button sagittarius = (Button) findViewById(R.id.sagittarius);
        Button capricon = (Button) findViewById(R.id.capricon);
        Button aquarius = (Button) findViewById(R.id.aquarius);
        Button pisces = (Button) findViewById(R.id.pisces);
        aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "овен");
                startActivity(intent);
            }
        });
        taurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "телец");
                startActivity(intent);
            }
        });
        gemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "близнецы");
                startActivity(intent);
            }
        });
        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "рак");
                startActivity(intent);
            }
        });
        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "лев");
                startActivity(intent);
            }
        });
        virgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "дева");
                startActivity(intent);
            }
        });
        scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "скорпион");
                startActivity(intent);
            }
        });
        sagittarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "стрелец");
                startActivity(intent);
            }
        });
        capricon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "козерог");
                startActivity(intent);
            }
        });
        aquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "водолей");
                startActivity(intent);
            }
        });
        pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoroscopeActivity.class);
                intent.putExtra("zodiac", "рыбы");
                startActivity(intent);
            }
        });
    }
}