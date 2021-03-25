package org.techtown.softsquared_baemin.src.main.search

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.softsquared_baemin.R

class SearchAdapter(val context: Context, private val items : ArrayList<SearchData>) :
        RecyclerView.Adapter<SearchAdapter.Holder>(){

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val rankNum = itemView.findViewById<TextView>(R.id.fragment_search_rank_num)
        val rankItem = itemView.findViewById<TextView>(R.id.fragment_search_rank_item)
        val rankIcon = itemView.findViewById<ImageView>(R.id.fragment_search_rank_icon)

        fun bind(item : SearchData, context: Context) {

            rankNum.text = item.rankNumber.toString()
            rankItem.text = item.rankItem
            rankIcon.setImageResource(item.rankIcon)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_search_recycler_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }

}