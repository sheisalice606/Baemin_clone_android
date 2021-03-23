package org.techtown.softsquared_baemin.src.main.category.japan

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentJapanBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class JapanFragment :
        BaseFragment<FragmentJapanBinding>(FragmentJapanBinding::bind, R.layout.fragment_japan) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val japanMenuListItem = ArrayList<JapanData>()


        japanMenuListItem.add(
                JapanData(
                        R.drawable.category_japan_menu_1,
                        "소래포구어시장",
                        4.6F,
                        39,
                        54,
                        20000,
                        6000,
                        7000,
                        new = false,
                        takeout = false
                )
        )
        // 소래포구어시장

        japanMenuListItem.add(
                JapanData(
                        R.drawable.category_japan_menu_2,
                        "오징어 청춘",
                        4.7F,
                        40,
                        55,
                        200000,
                        6000,
                        7000,
                        new = false,
                        takeout = true
                )
        )
        // 오징어 청춘

        japanMenuListItem.add(
                JapanData(
                        R.drawable.category_japan_menu_3,
                        "최고수산",
                        4.9F,
                        47,
                        55,
                        15000,
                        0,
                        5000,
                        new = false,
                        takeout = false
                )
        )
        // 최고수산


        japanMenuListItem.add(
                JapanData(
                        R.drawable.category_japan_menu_4,
                        "육회마니아",
                        5.0F,
                        40,
                        60,
                        13000,
                        0,
                        5000,
                        new = false,
                        takeout = false
                )
        )
        // 육회마니아


        val japanAdapter = JapanAdapter(this.requireContext(), japanMenuListItem)

        binding.fragmentJapanRecycler1.adapter = japanAdapter
        // Adapter 설정


    }

}