package org.techtown.softsquared_baemin.src.main.menuList

import android.annotation.SuppressLint
import android.os.Bundle
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityMenuListBinding

class MenuListActivity : BaseActivity<ActivityMenuListBinding>(ActivityMenuListBinding::inflate){

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.activityMenuListBack.setOnClickListener {
            finish()
        }


        binding.activityMenuListMain.text =
                sSharedPreferences.getString("restaurant", "blank")

        binding.activityMenuListRestaurantName.text =
                sSharedPreferences.getString("restaurant", "blank")

        binding.activityMenuListRestaurantScore.text =
                sSharedPreferences.getString("score", "blank")

        binding.activityMenuListLowCost.text =
                sSharedPreferences.getString("low_cost", "blank")

        binding.activityMenuListDeliveryTime.text =
                sSharedPreferences.getString("delivery_time", "blank")

        binding.activityMenuListDeliveryTip.text =
                sSharedPreferences.getString("delivery_tip", "blank")


    }

}