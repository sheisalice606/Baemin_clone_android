package org.techtown.softsquared_baemin.src.main.myHome

import android.content.Intent
import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyHomeFrmDeliveryBinding
import org.techtown.softsquared_baemin.src.main.MainActivity
import org.techtown.softsquared_baemin.src.main.category.CategoryActivity

class MyHomeFrmDeliveryFragment
    : BaseFragment<FragmentMyHomeFrmDeliveryBinding>(FragmentMyHomeFrmDeliveryBinding::bind, R.layout.fragment_my_home_frm_delivery) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val topBannerId = ArrayList<Int>()
        // 상단 광고 Image
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_1)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_2)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_3)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_4)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_5)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_6)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_7)
        topBannerId.add(R.drawable.fragment_my_home_frm_delivery_top_banner_img_8)

        val topBannerPageAdapter = DeliveryTopBannerPageAdapter(topBannerId)
        binding.fragmentMyHomeFrmDeliveryTopBanner.offscreenPageLimit = 8
        binding.fragmentMyHomeFrmDeliveryTopBanner.adapter = topBannerPageAdapter
        // 상단 광고 viewPager



        val botBannerId = ArrayList<Int>()
        // 하단 광고 Image
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_1)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_2)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_3)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_4)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_5)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_6)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_7)
        botBannerId.add(R.drawable.fragment_my_home_frm_delivery_bot_banner_img_8)

        val botBannerPageAdapter = DeliveryBotBannerPageAdapter(botBannerId)
        binding.fragmentMyHomeFrmDeliveryBotBanner.offscreenPageLimit = 8
        binding.fragmentMyHomeFrmDeliveryBotBanner.adapter = botBannerPageAdapter
        // 하단 광고 viewPager


        val item = arrayOf(
                binding.fragmentMyHomeFrmDeliveryCategory1, binding.fragmentMyHomeFrmDeliveryCategory2,
                binding.fragmentMyHomeFrmDeliveryCategory3, binding.fragmentMyHomeFrmDeliveryCategory4,
                binding.fragmentMyHomeFrmDeliveryCategory5, binding.fragmentMyHomeFrmDeliveryCategory6,
                binding.fragmentMyHomeFrmDeliveryCategory7, binding.fragmentMyHomeFrmDeliveryCategory8,
                binding.fragmentMyHomeFrmDeliveryCategory9, binding.fragmentMyHomeFrmDeliveryCategory10,
                binding.fragmentMyHomeFrmDeliveryCategory11, binding.fragmentMyHomeFrmDeliveryCategory12,
                binding.fragmentMyHomeFrmDeliveryCategory13, binding.fragmentMyHomeFrmDeliveryCategory14,
                binding.fragmentMyHomeFrmDeliveryCategory15, binding.fragmentMyHomeFrmDeliveryCategory16,
                binding.fragmentMyHomeFrmDeliveryCategory17, binding.fragmentMyHomeFrmDeliveryCategory18,
                binding.fragmentMyHomeFrmDeliveryCategory19, binding.fragmentMyHomeFrmDeliveryCategory20
        )
        // 메인 메뉴 아이콘


        for(index in 0 .. item.size-1) {
            item[index].setOnClickListener {
                val intent = Intent(activity as MainActivity, CategoryActivity::class.java)
                startActivity(intent)
            }
        }
        // 아이콘 클릭 -> CategoryActivity


    }
}