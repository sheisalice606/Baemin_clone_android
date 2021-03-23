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


        val category = arrayOf(
                binding.fragmentMyHomeFrmDeliveryCategoryKorea, // 0 -> 한식
                binding.fragmentMyHomeFrmDeliveryCategorySnack, // 1 -> 분식
                binding.fragmentMyHomeFrmDeliveryCategoryJapan, // 2 -> 일식
                binding.fragmentMyHomeFrmDeliveryCategoryChicken, // 3 -> 치킨
                binding.fragmentMyHomeFrmDeliveryCategoryPizza,  // 4 -> 피자
                binding.fragmentMyHomeFrmDeliveryCategoryAsian, // 5 -> 아시안
                binding.fragmentMyHomeFrmDeliveryCategoryChina, // 6 -> 중식
                binding.fragmentMyHomeFrmDeliveryCategoryPork, // 7 -> 족발
                binding.fragmentMyHomeFrmDeliveryCategoryNight, // 8 -> 야식
                binding.fragmentMyHomeFrmDeliveryCategorySteamed, // 9 -> 찜
                binding.fragmentMyHomeFrmDeliveryCategoryLunchBox, // 10 -> 도시락
                binding.fragmentMyHomeFrmDeliveryCategoryCafe, // 11 -> 카페
                binding.fragmentMyHomeFrmDeliveryCategoryFastFood // 12 -> 패스트푸드
        )
        // 카테고리
        // Tab Page 순서 맞춤


        val notCategory = arrayOf(
                binding.fragmentMyHomeFrmDeliveryCategoryShow, // 쇼라이브
                binding.fragmentMyHomeFrmDeliveryCategoryPresent, // 선물하기
                binding.fragmentMyHomeFrmDeliveryCategoryTakeOut, // 포장
                binding.fragmentMyHomeFrmDeliveryCategoryMyself, // 1인분
                binding.fragmentMyHomeFrmDeliveryCategoryBrand, // 브랜드관
                binding.fragmentMyHomeFrmDeliveryCategoryRanking, // 맛집랭킹
                binding.fragmentMyHomeFrmDeliveryCategoryCountry // 전국별미
        )
        // 기타 메뉴






        for(index in 0 .. category.size-1) {
            category[index].setOnClickListener {
                val intent = Intent(activity as MainActivity, CategoryActivity::class.java)
                intent.putExtra("pageNum", index)
                startActivity(intent)
            }
        }
        // CategoryActivity 시작
        // 시작 Fragment 세팅



        for(index in 0 .. notCategory.size-1) {
            notCategory[index].setOnClickListener {
               showCustomToast("기능 미구현")
            }
        }
        // 기능 미구현 메세지 출력




    }
}