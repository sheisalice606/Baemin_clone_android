package org.techtown.softsquared_baemin.src.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.src.main.adapterData.MyPageData2

class MyPageAdapter2(val context : Context, private val items : ArrayList<MyPageData2>) :
        RecyclerView.Adapter<MyPageAdapter2.Holder>(){

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val text_main = itemView.findViewById<TextView>(R.id.before_login_my_page_list_2_text1)

        fun bind(item :MyPageData2, context: Context) {
            text_main.text = item.text1
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.my_page_list_2, parent, false)
        return Holder(view)
    }

}