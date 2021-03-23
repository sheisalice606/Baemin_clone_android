package org.techtown.softsquared_baemin.src.main.category.pork

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentPorkBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter

class PorkFragment :
        BaseFragment<FragmentPorkBinding>(FragmentPorkBinding::bind, R.layout.fragment_pork){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val porkMenuListItem = ArrayList<PorkData>()

        porkMenuListItem.add(
                PorkData(
                        R.drawable.category_pork_menu_1,
                        "삼송꿀족",
                        4.9F,
                        37,
                        52,
                        20000,
                        0,
                        2000,
                        new = true,
                        takeout = false
                )
        )
        // 삼송꿀족

        porkMenuListItem.add(
                PorkData(
                        R.drawable.category_pork_menu_2,
                        "구구족 원흥역점",
                        4.9F,
                        49,
                        64,
                        15900,
                        1000,
                        4000,
                        new = true,
                        takeout = true
                )
        )
        // 구구족 원흥역점

        porkMenuListItem.add(
                PorkData(
                        R.drawable.category_pork_menu_3,
                        "대마족발 삼송점",
                        4.9F,
                        29,
                        44,
                        20000,
                        0,
                        2000,
                        new = true,
                        takeout = true
                )
        )
        // 대마족발 삼송점

        porkMenuListItem.add(
                PorkData(
                        R.drawable.category_pork_menu_4,
                        "고양스타족발",
                        4.9F,
                        48,
                        63,
                        22000,
                        0,
                        2500,
                        new = false,
                        takeout = true
                )
        )
        // 고양스타족발

        val porkAdapter = PorkAdater(this.requireContext(), porkMenuListItem)

        binding.fragmentPorkRecycler1.adapter = porkAdapter
        // Adapter 설정


    }
}