package org.techtown.softsquared_baemin.src.main.love

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentLoveBinding
import org.techtown.softsquared_baemin.src.main.MainActivity

class LoveFragment :
    BaseFragment<FragmentLoveBinding>(FragmentLoveBinding::bind, R.layout.fragment_love){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_love_frm, LoveLoveFragment())
                .commitAllowingStateLoss()



        binding.fragmentLoveTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position) {

                    0 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_love_frm, LoveLoveFragment())
                                .commitAllowingStateLoss()
                    }

                    1 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_love_frm, LoveNowFragment())
                                .commitAllowingStateLoss()
                    }

                    2 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_love_frm, LoveCallFragment())
                                .commitAllowingStateLoss()
                    }

                }
            }

        })


    }

}