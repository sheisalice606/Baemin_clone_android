package org.techtown.softsquared_baemin.src.main.category.night

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentNightBinding

class NightFragment :
        BaseFragment<FragmentNightBinding>(FragmentNightBinding::bind, R.layout.fragment_night){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nightMenuListItem = ArrayList<NightData>()


        nightMenuListItem.add(
                NightData(
                        R.drawable.category_night_menu_1,
                        "쏭쏭퓨전포차",
                        4.8F,
                        39,
                        53,
                        17500,
                        1000,
                        2500,
                        new = true,
                        takeout = true
                )
        )
        // 쏭쏭퓨전포차

        nightMenuListItem.add(
                NightData(
                        R.drawable.category_night_menu_2,
                        "곱창전문 백곱식당",
                        4.8F,
                        45,
                        60,
                        12000,
                        2000,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 곱창전문 백곱식당

        nightMenuListItem.add(
                NightData(
                        R.drawable.category_night_menu_3,
                        "일초닭발 원흥본점",
                        4.8F,
                        40,
                        55,
                        15000,
                        0,
                        3000,
                        new = false,
                        takeout = true
                )
        )
        // 일초닭발 원흥본점

        nightMenuListItem.add(
                NightData(
                        R.drawable.category_night_menu_4,
                        "청춘국물닭발",
                        4.9F,
                        36,
                        51,
                        15000,
                        1000,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 청춘국물닭발


        val nightAdapter = NightAdapter(this.requireContext(), nightMenuListItem)

        binding.fragmentNightRecycler1.adapter = nightAdapter
        // Adapter 설정

    }

}