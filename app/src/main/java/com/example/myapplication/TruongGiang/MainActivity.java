package com.example.myapplication.TruongGiang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    //khai bao cac control
    EditText So1, So2;
    Button pt1;

    TextView kq1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        So1=findViewById(R.id.SoThuNhat);
        So2=findViewById(R.id.SoThuHai);
        pt1=findViewById(R.id.PhepToan);
        kq1=findViewById(R.id.KetQua);
        pt1.setOnClickListener(v-> tinhTong());
    }

    private void tinhTong() {
        String str1=So1.getText().toString();
        float so1=Float.parseFloat(str1);
        String str2=So2.getText().toString();
        float so2=Float.parseFloat(str2);
        float tong = so1 + so2;
        kq1.setText(String.valueOf(tong));
    }
}