package org.techtown.softsquared_baemin.src.main.category.korea

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentKoreaBinding

class KoreaFragment :
        BaseFragment<FragmentKoreaBinding>(FragmentKoreaBinding::bind, R.layout.fragment_korea) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // 한식 메뉴 더미 데이터 6종
        val koreaMenuListItem = ArrayList<KoreaData>()


        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_1,
                        "싸움의고수 고양삼송점",
                        4.9F,
                        50,
                        65,
                        7500,
                        2000,
                        2500,
                        new = true,
                        takeout = true
                )
        )
        // 싸움의고수 고양삼송점

        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_2,
                        "제육 미담",
                        4.9F,
                        55,
                        65,
                        9000,
                        2000,
                        2500,
                        new = false,
                        takeout = true
                )
        )
        // 제육 미담

        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_3,
                        "명가 가마솥 국밥",
                        4.7F,
                        40,
                        55,
                        14000,
                        0,
                        2000,
                        new = false,
                        takeout = true
                )
        )
        // 명가 가마솥 국밥

        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_4,
                        "홍구 등갈비",
                        4.9F,
                        48,
                        63,
                        22000,
                        0,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 홍구 등갈비

        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_5,
                        "짚신 매운갈비찜 고양삼송점",
                        4.5F,
                        50,
                        65,
                        24000,
                        0,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 짚신 매운갈비찜 고양삼송점

        koreaMenuListItem.add(
                KoreaData(
                        R.drawable.category_korea_menu_6,
                        "마선생마약국밥 은평점",
                        4.5F,
                        35,
                        40,
                        5000,
                        3000,
                        3500,
                        new = false,
                        takeout = false
                )
        )
        // 마선생마약국밥 은평점



        val koreaAdapter = KoreaAdapter(this.requireContext(), koreaMenuListItem)

        binding.fragmentKoreaRecycler1.adapter = koreaAdapter
        // Adapter 설정






    }
}