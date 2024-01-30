package com.example.myapplication.Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan41MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvQK;
    Context context=this;
    @SuppressLint("MissInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan41_main);
        Tuan4VolleyFn volleyFn=new Tuan4VolleyFn();
        tvQK= findViewById(R.id.tuan41btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvQK);
            }
        });
    }
}