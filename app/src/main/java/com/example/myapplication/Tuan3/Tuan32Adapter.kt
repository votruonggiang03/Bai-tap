package com.example.myapplication.Tuan3
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import org.w3c.dom.Text

class Tuan32Adapter(context: Context, ls:ArrayList<Tuan32Contact>): BaseAdapter() {
    var ls:ArrayList<Tuan32Contact> = ls
    var context: Context = context

    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        var vax: ViewAX

        if(convertView==null)
        {
            vax = ViewAX()
            c = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item, null)
                vax.img_hinh=c.findViewById(R.id.tuan32ItemHinh)
                vax.tv_ten=c.findViewById(R.id.tuan32ItemTen)
                vax.tv_tuoi=c.findViewById(R.id.tuan32ItemTuoi)
            c.tag = vax
            }
        else
        {
            vax=c!!.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return c!!
    }
    inner class ViewAX{
        var img_hinh:ImageView? = null
        var tv_ten:TextView? = null
        var tv_tuoi:TextView? = null
    }

}