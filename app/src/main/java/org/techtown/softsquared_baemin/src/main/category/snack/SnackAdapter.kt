package org.techtown.softsquared_baemin.src.main.category.snack

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class SnackAdapter(val context: Context, private val items : ArrayList<SnackData>) :
        RecyclerView.Adapter<SnackAdapter.Holder>() {

    inner class Holder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val restaurantIcon = itemview.findViewById<ImageView>(R.id.fragment_snack_restaurant_icon)

        // 가게 아이콘
        val restaurant = itemview.findViewById<TextView>(R.id.fragment_snack_restaurant)

        // 가게 이름
        val newIcon = itemview.findViewById<ImageView>(R.id.fragment_snack_new)

        // 신규 아이콘
        val takeOut = itemview.findViewById<ImageView>(R.id.fragment_snack_take_out)

        // 포장 아이콘
        val score = itemview.findViewById<TextView>(R.id.fragment_snack_score)

        // 평점
        val deliveryCostTime = itemview.findViewById<TextView>(R.id.fragment_snack_delivery_cost_time)

        // 배달 시간 + 최소주문비용
        val deliveryTip = itemview.findViewById<TextView>(R.id.fragment_snack_tip)
        // 배달팁


        @SuppressLint("SetTextI18n")
        fun bind(item: SnackData, context: Context) {

            restaurantIcon.setImageResource(item.restaurantIcon)
            // 가게 아이콘

            restaurant.text = item.restaurant
            // 가게 이름

            if (item.new) {
                newIcon.setImageResource(R.drawable.category_new_icon)
            } else {
                newIcon.setImageResource(0)
            }
            // 신규 아이콘

            if (item.takeout) {
                takeOut.setImageResource(R.drawable.category_take_out_icon)
            } else {
                takeOut.setImageResource(0)
            }
            // 포장 아이콘

            score.text = item.score.toString()
            // 평점

            deliveryCostTime.text = item.delivery_time_min.toString() +
                    "~" + item.delivery_time_max.toString() +
                    "분, 최소주문" + item.delivery_cost_min.toString() + "원"
            // 배달 시간 + 최소주문비용

            deliveryTip.text = "배달팁" + item.delivery_tip_min.toString() +
                    " - " + item.delivery_tip_max.toString() + "원"
            // 배달팁

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_snack_recycler_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }
}