package com.example.myapplication.Tuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan32MainActivity : AppCompatActivity() {
    var adap: Tuan32Adapter? = null
    var ls: ArrayList<Tuan32Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main)
        var lv=findViewById<ListView>(R.id.tuan32lv)
        ls.add(Tuan32Contact("Nguyen Van A", "19",R.drawable.ic_launcher_background))
        ls.add(Tuan32Contact("Nguyen Van B", "20",R.drawable.ic_launcher_background))
        ls.add(Tuan32Contact("Nguyen Van C", "12",R.drawable.ic_launcher_background))
        ls.add(Tuan32Contact("Nguyen Van D", "16",R.drawable.ic_launcher_background))
        ls.add(Tuan32Contact("Nguyen Van E", "18",R.drawable.ic_launcher_background))
        adap=Tuan32Adapter(this,ls)
        lv.adapter=adap
    }
}