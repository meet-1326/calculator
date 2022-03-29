package com.raw.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1,num2,ans;
    char op='<';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvans = findViewById(R.id.tvans);
        TextView tvsub = findViewById(R.id.tvsub);

        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bplus,bmin,bmulti,bdiv,bans,bper,bpoint,bac;

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.bzero);
        b00 = findViewById(R.id.bdzero);

        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmulti = findViewById(R.id.bmulti);
        bdiv = findViewById(R.id.bdiv);
        bans = findViewById(R.id.bans);
        bpoint = findViewById(R.id.bpoint);
        bper = findViewById(R.id.bper);
        bac = findViewById(R.id.bac);

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvans.setText("");
                tvsub.setText("");
                num1 = 0;
                op = '<';
                num2 = 0;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 1;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 1;
                    tvans.setText(""+num2);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 2;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 2;
                    tvans.setText(""+num2);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 3;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 3;
                    tvans.setText(""+num2);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 4;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 4;
                    tvans.setText(""+num2);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 5;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 5;
                    tvans.setText(""+num2);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 6;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 6;
                    tvans.setText(""+num2);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 7;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 7;
                    tvans.setText(""+num2);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 8;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 8;
                    tvans.setText(""+num2);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 9;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 9;
                    tvans.setText(""+num2);
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 0;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 0;
                    tvans.setText(""+num2);
                }
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    num1 = num1 * 10 + 00;
                    tvans.setText(""+num1);
                }else{
                    num2 = num2 * 10 + 00;
                    tvans.setText(""+num2);
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsub.setText(tvans.getText().toString());
                tvans.setText("");
                op = '+';
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsub.setText(tvans.getText().toString());
                tvans.setText("");
                op = '-';
            }
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsub.setText(tvans.getText().toString());
                tvans.setText("");
                op = '*';
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsub.setText(tvans.getText().toString());
                tvans.setText("");
                op = '/';
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsub.setText(tvans.getText().toString());
                tvans.setText("");
                if(op == '*'){
                    num1 = Integer.parseInt(tvsub.getText().toString());
                    num2 = Integer.parseInt(tvans.getText().toString());
                    ans = num1*num2/100;
                    tvans.setText(""+ans);
                }else{
                    ans = 143;
                    tvans.setText(""+ans);
                }
            }
        });
        bans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == '<'){
                    Toast.makeText(MainActivity.this, "Plese Enter Opreter", Toast.LENGTH_SHORT).show();
                }else if(num2 == 0){
                    Toast.makeText(MainActivity.this, "Plese Enter Second Number", Toast.LENGTH_SHORT).show();
                }else{
                    num1 = Integer.parseInt(tvsub.getText().toString());
                    num2 = Integer.parseInt(tvans.getText().toString());

                    if(op == '+'){
                        ans = num1+num2;
                        tvans.setText(""+ans);
                    }else if(op == '-'){
                        ans = num1-num2;
                        tvans.setText(""+ans);
                    }else if(op == '*'){
                        ans = num1*num2;
                        tvans.setText(""+ans);
                    }else if(op == '/'){
                        ans = num1/num2;
                        tvans.setText(""+ans);
                    }else if(op == '%'){
                        ans = num1*num2/100;
                        tvans.setText(""+ans);
                    } else{
                        ans = 143;
                        tvans.setText(""+ans);
                    }
                }
            }
        });
    }
}