package org.techtown.softsquared_baemin.src.main.category.fastFood

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentFastfoodBinding
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaAdapter
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaData

class FastFoodFragment :
        BaseFragment<FragmentFastfoodBinding>(FragmentFastfoodBinding::bind, R.layout.fragment_fastfood) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fastFoodMenuListItem = ArrayList<FastFoodData>()


        fastFoodMenuListItem.add(
                FastFoodData(
                        R.drawable.category_fastfood_menu_1,
                        "맥도날드 고양삼송점",
                        3.6F,
                        69,
                        84,
                        3000,
                        0,
                        2000,
                        new = true,
                        takeout = true
                )
        )

        val fastFoodAdapter = FastFoodAdpater(this.requireContext(), fastFoodMenuListItem)

        binding.fragmentFastFoodRecycler1.adapter = fastFoodAdapter
        // Adapter 설정


    }

}