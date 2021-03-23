package org.techtown.softsquared_baemin.src.main.category.asian

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentAsianBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter

class AsianFragment :
        BaseFragment<FragmentAsianBinding>(FragmentAsianBinding::bind, R.layout.fragment_asian){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val asianMenuListItem = ArrayList<AsianData>()


        asianMenuListItem.add(
                AsianData(
                        R.drawable.category_asian_menu_1,
                        "황산",
                        4.9F,
                        49,
                        64,
                        13000,
                        3500,
                        4500,
                        new = true,
                        takeout = true
                )
        )
        // 황산


        asianMenuListItem.add(
                AsianData(
                        R.drawable.category_asian_menu_2,
                        "면부심 파스타 삼송점",
                        5.0F,
                        44,
                        59,
                        9000,
                        0,
                        2500,
                        new = true,
                        takeout = true
                )
        )
        // 면부심 파스타 삼송점


        asianMenuListItem.add(
                AsianData(
                        R.drawable.category_asian_menu_3,
                        "포메인 고양삼송점",
                        4.8F,
                        40,
                        55,
                        15000,
                        1500,
                        3500,
                        new = false,
                        takeout = true
                )
        )
        // 포메인 고양삼송점


        asianMenuListItem.add(
                AsianData(
                        R.drawable.category_asian_menu_4,
                        "스몰하노이신원점",
                        4.9F,
                        40,
                        55,
                        11000,
                        1000,
                        3000,
                        new = false,
                        takeout = false
                )
        )
        // 스몰하노이신원점


        asianMenuListItem.add(
                AsianData(
                        R.drawable.category_asian_menu_5,
                        "이름없는파스타 원흥역점",
                        4.8F,
                        49,
                        64,
                        6900,
                        700,
                        3700,
                        new = false,
                        takeout = false
                )
        )
        // 이름없는파스타 원흥역점


        val asianAdapter = AsianAdapter(this.requireContext(), asianMenuListItem)

        binding.fragmentAsianRecycler1.adapter = asianAdapter
        // Adapter 설정

    }

}