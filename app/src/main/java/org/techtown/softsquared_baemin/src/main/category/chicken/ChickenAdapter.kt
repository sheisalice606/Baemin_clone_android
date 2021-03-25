package org.techtown.softsquared_baemin.src.main.category.chicken

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.ApplicationClass
import org.techtown.softsquared_baemin.src.main.menuList.MenuListActivity

class ChickenAdapter(val context: Context, private val items : ArrayList<ChickenData>) :
        RecyclerView.Adapter<ChickenAdapter.Holder>(){



    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        init {
                itemView.setOnClickListener {

                val editor = ApplicationClass.sSharedPreferences.edit()
                val lowCostLen = lowCost.text.length
                val tipLen = deliveryTip.text.length

                editor.putString("restaurant", restaurant.text.toString())
                editor.putString("score", score.text.toString())
                editor.putString("low_cost", lowCost.text.toString().substring(5 until lowCostLen))
                editor.putString("delivery_tip", deliveryTip.text.toString().substring(3 until tipLen))
                editor.putString("delivery_time", deliveryTime.text.toString() + " 소요 예상")
                editor.apply()

                val intent = Intent(this.itemView.context, MenuListActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                this.itemView.context.startActivity(intent)

            }
        }

        val restaurantIcon = itemView.findViewById<ImageView>(R.id.fragment_chicken_restaurant_icon)

        // 가게 아이콘
        val restaurant = itemView.findViewById<TextView>(R.id.fragment_chicken_restaurant)

        // 가게 이름
        val newIcon = itemView.findViewById<ImageView>(R.id.fragment_chicken_new)

        // 신규 아이콘
        val takeOut = itemView.findViewById<ImageView>(R.id.fragment_chicken_take_out)

        // 포장 아이콘
        val score = itemView.findViewById<TextView>(R.id.fragment_chicken_score)

        val lowCost = itemView.findViewById<TextView>(R.id.fragment_chicken_low_cost)
        // 최소 주문 비용
        val deliveryTime = itemView.findViewById<TextView>(R.id.fragment_chicken_delivery_time)
        // 배달 시간

        // 배달 시간 + 최소주문비용
        val deliveryTip = itemView.findViewById<TextView>(R.id.fragment_chicken_tip)
        // 배달팁


        @SuppressLint("SetTextI18n")
        fun bind(item: ChickenData, context: Context) {

            restaurantIcon.setImageResource(item.restaurantIcon)
            // 가게 아이콘

            restaurant.text = item.restaurant
            // 가게 이름

            if(item.new && item.takeout) {
                newIcon.setImageResource(R.drawable.category_new_icon)
                takeOut.setImageResource(R.drawable.category_take_out_icon)
            }
            else if(item.new && !item.takeout) {
                newIcon.setImageResource(R.drawable.category_new_icon)
                takeOut.setImageResource(0)
            }
            else if(!item.new && item.takeout) {
                newIcon.setImageResource(R.drawable.category_take_out_icon)
                takeOut.setImageResource(0)
            }
            else if(!item.new && !item.takeout) {
                newIcon.setImageResource(0)
                takeOut.setImageResource(0)
            }
            // 신규 아이콘
            // 포장 아이콘

            score.text = item.score.toString()
            // 평점

            lowCost.text = "최소주문 " + item.delivery_cost_min.toString() + "원"
            // 최소 주문 비용
            deliveryTime.text = item.delivery_time_min.toString() + "~" + item.delivery_time_max.toString() + "분"
            // 배달 시간

            deliveryTip.text = "배달팁" + item.delivery_tip_min.toString() +
                    " - " + item.delivery_tip_max.toString() + "원"
            // 배달팁

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_chicken_recycler_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position], context)
    }
}