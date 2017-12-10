package com.example.user.taipeinightmarket;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class bigpic extends AppCompatActivity {
    ImageView bigImage;
    //ImageButton ibBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigpic);
        bigImage = (ImageView) findViewById(R.id.imageView);
        //ibBack = (ImageButton) findViewById(R.id.imageButton4);

        Intent intent = getIntent();
        String fpic = intent.getStringExtra("fid"); //照片id

        //int fid=Integer.parseInt(fpic);


        switch (fpic) {
            case "s11": {
                bigImage.setImageResource(R.drawable.bs11);
                break;
            }
            case "s12": {
                bigImage.setImageResource(R.drawable.bs12);
                break;
            }
            case "s21": {
                bigImage.setImageResource(R.drawable.bs21);
                break;
            }
            case "s22": {
                bigImage.setImageResource(R.drawable.bs22);
                break;
            }
            case "s41": {
                bigImage.setImageResource(R.drawable.bs41);
                break;
            }
            case "s42": {
                bigImage.setImageResource(R.drawable.bs42);
                break;
            }
            case "s51": {
                bigImage.setImageResource(R.drawable.bs51);
                break;
            }
            case "s52": {
                bigImage.setImageResource(R.drawable.bs52);
                break;
            }
            case "s61": {
                bigImage.setImageResource(R.drawable.bs61);
                break;
            }
            case "s62": {
                bigImage.setImageResource(R.drawable.bs62);
                break;
            }
            case "r11": {
                bigImage.setImageResource(R.drawable.br11);
                break;
            }
            case "r12": {
                bigImage.setImageResource(R.drawable.br12);
                break;
            }
            case "r21": {
                bigImage.setImageResource(R.drawable.br21);
                break;
            }
            case "r22": {
                bigImage.setImageResource(R.drawable.br22);
                break;
            }
            case "r31": {
                bigImage.setImageResource(R.drawable.br31);
                break;
            }
            case "r32": {
                bigImage.setImageResource(R.drawable.br32);
                break;
            }
            case "r41": {
                bigImage.setImageResource(R.drawable.br41);
                break;
            }
            case "r42": {
                bigImage.setImageResource(R.drawable.br42);
                break;
            }
            case "l21": {
                bigImage.setImageResource(R.drawable.bl21);
                break;
            }
            case "l22": {
                bigImage.setImageResource(R.drawable.bl22);
                break;
            }
            case "l31": {
                bigImage.setImageResource(R.drawable.bl31);
                break;
            }
            case "l32": {
                bigImage.setImageResource(R.drawable.bl32);
                break;
            }
            case "l41": {
                bigImage.setImageResource(R.drawable.bl41);
                break;
            }
            case "l42": {
                bigImage.setImageResource(R.drawable.bl42);
                break;
            }
            case "l61": {
                bigImage.setImageResource(R.drawable.bl61);
                break;
            }
            case "l62": {
                bigImage.setImageResource(R.drawable.bl62);
                break;
            }
            case "a21": {
                bigImage.setImageResource(R.drawable.ba21);
                break;
            }
            case "a22": {
                bigImage.setImageResource(R.drawable.ba22);
                break;
            }
            case "a31": {
                bigImage.setImageResource(R.drawable.ba31);
                break;
            }
            case "a32": {
                bigImage.setImageResource(R.drawable.ba32);
                break;
            }
            case "a41": {
                bigImage.setImageResource(R.drawable.ba41);
                break;
            }
            case "a42": {
                bigImage.setImageResource(R.drawable.ba42);
                break;
            }
            case "a51": {
                bigImage.setImageResource(R.drawable.ba51);
                break;
            }
            case "a52": {
                bigImage.setImageResource(R.drawable.ba52);
                break;
            }
        }
    }
}
