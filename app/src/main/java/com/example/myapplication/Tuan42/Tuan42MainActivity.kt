package com.example.myapplication.Tuan42

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan42MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvQK:TextView? = null
    var context: Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan42_main)
        btn=findViewById(R.id.tuan41btn)
        tvQK=findViewById(R.id.tuan42TvQK)
        val fn=VolleyKotlinFn()
        btn!!.setOnClickListener{
            fn.getJSONArrayObjects(context,tvQK!!)
        }
    }
}