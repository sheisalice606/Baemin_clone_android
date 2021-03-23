package org.techtown.softsquared_baemin.src.main.category.china

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentChinaBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter

class ChinaFragment :
        BaseFragment<FragmentChinaBinding>(FragmentChinaBinding::bind, R.layout.fragment_china) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val chinaMenuListItem = ArrayList<ChinaData>()


        chinaMenuListItem.add(
                ChinaData(
                        R.drawable.category_china_menu_1,
                        "오쇼짬뽕 신원동점",
                        4.7F,
                        49,
                        64,
                        14000,
                        0,
                        3000,
                        new = true,
                        takeout = true
                )
        )
        // 쇼짬뽕 신원동점


        chinaMenuListItem.add(
                ChinaData(
                        R.drawable.category_china_menu_2,
                        "삼선각",
                        4.7F,
                        39,
                        54,
                        14000,
                        2000,
                        2500,
                        new = false,
                        takeout = true
                )
        )
        // 삼선각


        chinaMenuListItem.add(
                ChinaData(
                        R.drawable.category_china_menu_3,
                        "진미",
                        4.6F,
                        44,
                        59,
                        17000,
                        0,
                        2000,
                        new = false,
                        takeout = true
                )
        )
        // 진미


        val chinaAdapter = ChinaAdapter(this.requireContext(), chinaMenuListItem)

        binding.fragmentChinaRecycler1.adapter = chinaAdapter
        // Adapter 설정




    }

}