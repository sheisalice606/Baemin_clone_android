package org.techtown.softsquared_baemin.src.main.category.lunchBox

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentLunchBoxBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class LunchBoxFragment :
        BaseFragment<FragmentLunchBoxBinding>(FragmentLunchBoxBinding::bind, R.layout.fragment_lunch_box){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lunchBoxMenuListItem = ArrayList<LunchBoxData>()

        lunchBoxMenuListItem.add(
                LunchBoxData(
                        R.drawable.category_lunchbox_menu_1,
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

        lunchBoxMenuListItem.add(
                LunchBoxData(
                        R.drawable.category_lunchbox_menu_2,
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

        lunchBoxMenuListItem.add(
                LunchBoxData(
                        R.drawable.category_lunchbox_menu_3,
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


        val lunchBoxAdapter = LunchBoxAdapter(this.requireContext(), lunchBoxMenuListItem)

        binding.fragmentLunchBoxRecycler1.adapter = lunchBoxAdapter
        // Adapter 설정


    }

}