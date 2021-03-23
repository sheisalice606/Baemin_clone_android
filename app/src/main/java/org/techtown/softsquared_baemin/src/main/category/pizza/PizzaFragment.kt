package org.techtown.softsquared_baemin.src.main.category.pizza

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentPizzaBinding
class PizzaFragment :
        BaseFragment<FragmentPizzaBinding>(FragmentPizzaBinding::bind, R.layout.fragment_pizza){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val pizzaMenuListItem = ArrayList<PizzaData>()


        pizzaMenuListItem.add(
                PizzaData(
                        R.drawable.category_pizza_menu_2,
                        "피자마루 지축점",
                        4.9F,
                        50,
                        60,
                        10000,
                        0,
                        1000,
                        new = true,
                        takeout = false
                )
        )
        // 피자마루 지축점


        pizzaMenuListItem.add(
                PizzaData(
                        R.drawable.category_pizza_menu_1,
                        "피자딜라잇 은평뉴타운점",
                        5.0F,
                        39,
                        54,
                        15900,
                        0,
                        2000,
                        new = false,
                        takeout = true
                )
        )
        // 피자딜라잇 은평뉴타운점

        val pizzaAdapter = PizzaAdpater(this.requireContext(), pizzaMenuListItem)

        binding.fragmentPizzaRecycler1.adapter = pizzaAdapter
        // Adapter 설정


    }

}