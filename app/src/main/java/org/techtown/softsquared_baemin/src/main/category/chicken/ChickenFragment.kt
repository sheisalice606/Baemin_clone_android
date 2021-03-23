package org.techtown.softsquared_baemin.src.main.category.chicken

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentChickenBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter

class ChickenFragment
    : BaseFragment<FragmentChickenBinding>(FragmentChickenBinding::bind, R.layout.fragment_chicken) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val chickenMenuListItem = ArrayList<ChickenData>()


        chickenMenuListItem.add(
                ChickenData(
                        R.drawable.category_chicken_menu_5,
                        "부어치킨 고양삼송점",
                        4.9F,
                        49,
                        55,
                        15000,
                        0,
                        2000,
                        new = true,
                        takeout = true
                )
        )
        // 부어치킨 고양삼송점


        chickenMenuListItem.add(
                ChickenData(
                        R.drawable.category_chicken_menu_1,
                        "수원왕갈비통닭 고양삼송점",
                        4.6F,
                        50,
                        65,
                        13000,
                        0,
                        2000,
                        new = false,
                        takeout = false
                )
        )
        // 수원왕갈비통닭 고양삼송점


        chickenMenuListItem.add(
                ChickenData(
                        R.drawable.category_chicken_menu_2,
                        "삼송 치킨",
                        4.8F,
                        55,
                        65,
                        10000,
                        0,
                        2000,
                        new = false,
                        takeout = false
                )
        )
        // 삼송 치킨


        chickenMenuListItem.add(
                ChickenData(
                        R.drawable.category_chicken_menu_3,
                        "치킨플러스 고양신원점",
                        4.8F,
                        40,
                        55,
                        14900,
                        0,
                        4000,
                        new = false,
                        takeout = true
                )
        )
        // 치킨플러스 고양신원점


        chickenMenuListItem.add(
                ChickenData(
                        R.drawable.category_chicken_menu_4,
                        "1988옛날통닭 삼송점",
                        4.8F,
                        48,
                        63,
                        10000,
                        0,
                        2000,
                        new = false,
                        takeout = true
                )
        )
        // 1988옛날통닭 삼송점

        val chickenAdapter = ChickenAdapter(this.requireContext(), chickenMenuListItem)

        binding.fragmentChickenRecycler1.adapter = chickenAdapter
        // Adapter 설정


    }

}