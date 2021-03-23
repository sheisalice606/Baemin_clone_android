package org.techtown.softsquared_baemin.src.main.category.snack

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSnackBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class SnackFragment :
        BaseFragment<FragmentSnackBinding>(FragmentSnackBinding::bind, R.layout.fragment_snack){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // 한식 메뉴 더미 데이터 6종
        val snackMenuListItem = ArrayList<SnackData>()


        snackMenuListItem.add(
                SnackData(
                        R.drawable.category_snack_menu_1,
                        "혼밥 1등맛집 미노스쉐프",
                        4.8F,
                        38,
                        55,
                        9900,
                        1400,
                        3500,
                        new = false,
                        takeout = false
                )
        )
        // 혼밥 1등맛집 미노스쉐프

        snackMenuListItem.add(
                SnackData(
                        R.drawable.category_korea_menu_2,
                        "떡볶이의 품격 고양삼송점",
                        4.8F,
                        50,
                        65,
                        9900,
                        0,
                        2500,
                        new = false,
                        takeout = false
                )
        )
        // 떡볶이의 품격 고양삼송점


        val snackAdapter = SnackAdapter(this.requireContext(), snackMenuListItem)

        binding.fragmentSnackRecycler1.adapter = snackAdapter
        // Adapter 설정


    }

}