package org.techtown.softsquared_baemin.src.main.myPage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.softsquared_baemin.R

class MyPageAdapter1(val context : Context, private val items : ArrayList<MyPageData1>) :
        RecyclerView.Adapter<MyPageAdapter1.Holder>() {


    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val text_main = itemView.findViewById<TextView>(R.id.before_login_my_page_list_1_text1)
        val text_sub = itemView.findViewById<TextView>(R.id.before_login_my_page_list_1_text2)

        fun bind(item : MyPageData1, context: Context) {
            text_main.text = item.text1
            text_sub.text = item.text2
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.my_page_list_1, parent, false)
        return Holder(view)
    }

}