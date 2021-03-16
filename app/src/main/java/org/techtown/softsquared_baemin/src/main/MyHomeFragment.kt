package org.techtown.softsquared_baemin.src.main

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyHomeBinding
import org.techtown.softsquared_baemin.src.main.myHome.MyHomeFrm2Fragment
import org.techtown.softsquared_baemin.src.main.myHome.MyHomeFrmFragment

class MyHomeFragment :
        BaseFragment<FragmentMyHomeBinding>(FragmentMyHomeBinding::bind, R.layout.fragment_my_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_my_home_frm, MyHomeFrmFragment())
                ?.commitAllowingStateLoss()
        // 기본 -> 배달 tab

        binding.fragmentMyHomeTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {

                val position = tab?.position
                // 페이지 구분
                when(position) {
                    0 -> { // 배달
                        activity?.supportFragmentManager
                                ?.beginTransaction()
                                ?.replace(R.id.fragment_my_home_frm, MyHomeFrmFragment())
                                ?.commitAllowingStateLoss()
                    }
                    1 -> { // 포장/방문
                        activity?.supportFragmentManager
                                ?.beginTransaction()
                                ?.replace(R.id.fragment_my_home_frm, MyHomeFrm2Fragment())
                                ?.commitAllowingStateLoss()
                    }
                }

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Nope
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //Nope
            }

        }) // Tab 화면이동 구현



    }

}