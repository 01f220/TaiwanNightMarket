package com.example.user.taipeinightmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btShihlin;
    ImageButton btRaohe;
    ImageButton btLeroy;
    ImageButton btAirport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //士林夜市
        btShihlin = (ImageButton) findViewById(R.id.btShihlin);
        btShihlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String marketName="SHIHLIN NIGHT MARKET";
                Intent intent=new Intent();
                Bundle extras = new Bundle();
                extras.putString("marketName",marketName);
                intent.putExtras(extras);
                intent.setClass(getApplicationContext(),Introduction.class);
                startActivity(intent);
            }
        });
        //饒河夜市
        btRaohe = (ImageButton) findViewById(R.id.btRaohe);
        btRaohe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String marketName="RAOHE NIGHT MARKET";
                Intent intent=new Intent();
                Bundle extras = new Bundle();
                extras.putString("marketName",marketName);
                intent.putExtras(extras);
                intent.setClass(getApplicationContext(),Introduction.class);
                startActivity(intent);
            }
        });
        //樂華夜市
        btLeroy = (ImageButton) findViewById(R.id.btLeroy);
        btLeroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String marketName="LEHUA NIGHT MARKET";
                Intent intent=new Intent();
                Bundle extras = new Bundle();
                extras.putString("marketName",marketName);
                intent.putExtras(extras);
                intent.setClass(getApplicationContext(),Introduction.class);
                startActivity(intent);
            }
        });
        //南機場夜市
        btAirport = (ImageButton) findViewById(R.id.btAirpory);
        btAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String marketName="NAJICHANG NIGHT MARKET";
                Intent intent=new Intent();
                Bundle extras = new Bundle();
                extras.putString("marketName",marketName);
                intent.putExtras(extras);
                intent.setClass(getApplicationContext(),Introduction.class);
                startActivity(intent);
            }
        });
    }




}
