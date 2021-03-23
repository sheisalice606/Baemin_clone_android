package org.techtown.softsquared_baemin.src.main.category.steamed

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSteamedBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter

class SteamedFragment :
        BaseFragment<FragmentSteamedBinding>(FragmentSteamedBinding::bind, R.layout.fragment_steamed){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val steamedMenuListItem = ArrayList<SteamedData>()


        steamedMenuListItem.add(
                SteamedData(
                        R.drawable.category_steamed_menu_1,
                        "두마리찜닭 두찜 고양삼송점",
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
        // 두마리찜닭 두찜 고양삼송점


        steamedMenuListItem.add(
                SteamedData(
                        R.drawable.category_steamed_menu_2,
                        "밥고 찜닭",
                        4.6F,
                        55,
                        65,
                        12000,
                        1000,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 밥고 찜닭


        steamedMenuListItem.add(
                SteamedData(
                        R.drawable.category_steamed_menu_3,
                        "이런 된장",
                        5.0F,
                        40,
                        55,
                        14000,
                        1000,
                        4000,
                        new = false,
                        takeout = false
                )
        )
        // 이런 된장


        steamedMenuListItem.add(
                SteamedData(
                        R.drawable.category_steamed_menu_4,
                        "편백찜&낙곱새",
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
        // 편백찜&낙곱새


        val steamedAdapter = SteamedAdapter(this.requireContext(), steamedMenuListItem)

        binding.fragmentSteamedRecycler1.adapter =  steamedAdapter
        // Adapter 설정

    }

}