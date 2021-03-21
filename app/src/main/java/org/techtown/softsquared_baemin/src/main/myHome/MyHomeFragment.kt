package org.techtown.softsquared_baemin.src.main.myHome

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyHomeBinding

class MyHomeFragment :
        BaseFragment<FragmentMyHomeBinding>(FragmentMyHomeBinding::bind, R.layout.fragment_my_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_my_home_frm, MyHomeFrmDeliveryFragment())
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
                                ?.replace(R.id.fragment_my_home_frm, MyHomeFrmDeliveryFragment())
                                ?.commitAllowingStateLoss()
                    }

                    1 -> { // 포장/방문
                        activity?.supportFragmentManager
                                ?.beginTransaction()
                                ?.replace(R.id.fragment_my_home_frm, MyHomeFrmTakeOutFragment())
                                ?.commitAllowingStateLoss()
                    }
                }
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

        }) // Tab 화면이동 구현






    }

}