package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan31MainActivity extends AppCompatActivity {
    ListView lv;
    Tuan31Adapter adapter;
    ArrayList<Tuan31Contact> ls= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lv.findViewById(R.id.tuan31lv);
        ls.add(new Tuan31Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background));
        ls.add(new Tuan31Contact("Tran Van B", "16", R.drawable.ic_launcher_background));
        ls.add(new Tuan31Contact("Le Van C", "20", R.drawable.ic_launcher_background));
        ls.add(new Tuan31Contact("Nguyen Thi D", "23", R.drawable.ic_launcher_background));
        ls.add(new Tuan31Contact("Tran Thi E", "19", R.drawable.ic_launcher_background));
        adapter = new Tuan31Adapter(ls, this);
        lv.setAdapter(adapter);

    }
}