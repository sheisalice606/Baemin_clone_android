package org.techtown.softsquared_baemin.src.main.category.cafe

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentCafeBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class CafeFragment :
        BaseFragment<FragmentCafeBinding>(FragmentCafeBinding::bind, R.layout.fragment_cafe){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val cafeMenuListItem = ArrayList<CafeData>()


        cafeMenuListItem.add(
                CafeData(
                        R.drawable.category_cafe_menu_1,
                        "카페루아빈",
                        4.7F,
                        49,
                        64,
                        15000,
                        0,
                        2000,
                        new = false,
                        takeout = false
                )
        )
        // 카페루아빈

        cafeMenuListItem.add(
                CafeData(
                        R.drawable.category_cafe_menu_2,
                        "이디야커피 고양삼송역점",
                        5.0F,
                        42,
                        57,
                        7900,
                        0,
                        100,
                        new = false,
                        takeout = true
                )
        )
        // 이디야커피 고양삼송역점

        cafeMenuListItem.add(
                CafeData(
                        R.drawable.category_cafe_menu_3,
                        "이디야커피 고양삼송시티점",
                        5.0F,
                        31,
                        46,
                        3000,
                        0,
                        3000,
                        new = false,
                        takeout = true
                )
        )
        // 이디야커피 고양삼송시티점

        cafeMenuListItem.add(
                CafeData(
                        R.drawable.category_cafe_menu_4,
                        "카페게이트 원흥역점",
                        4.9F,
                        31,
                        46,
                        9000,
                        0,
                        2000,
                        new = false,
                        takeout = true
                )
        )
        // 카페게이트 원흥역점

        cafeMenuListItem.add(
                CafeData(
                        R.drawable.category_cafe_menu_5,
                        "소울커피&샌드위치",
                        4.9F,
                        39,
                        54,
                        8000,
                        0,
                        1000,
                        new = false,
                        takeout = false
                )
        )
        // 소울커피&샌드위치


        val cafeAdapter = CafeAdapter(this.requireContext(), cafeMenuListItem)

        binding.fragmentCafeRecycler1.adapter = cafeAdapter
        // Adapter 설정

    }

}