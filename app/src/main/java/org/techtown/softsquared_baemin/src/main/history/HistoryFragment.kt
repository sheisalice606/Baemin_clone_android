package org.techtown.softsquared_baemin.src.main.history

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentHistoryBinding
import org.techtown.softsquared_baemin.src.main.MainActivity

class HistoryFragment :
    BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::bind, R.layout.fragment_history){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        (activity as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_history_frm, HistoryTakeOutFragment())
                .commitAllowingStateLoss()

        // 첫 화면





        binding.fragmentHistoryTab.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener {

            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position) {

                    0 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_history_frm, HistoryTakeOutFragment())
                                .commitAllowingStateLoss()
                    }

                    1 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_history_frm, HistoryBmartFragment())
                                .commitAllowingStateLoss()
                    }

                    2 -> {
                        (activity as MainActivity)
                                .supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.fragment_history_frm, HistoryLiveFragment())
                                .commitAllowingStateLoss()
                    }

                }
            }
        })





    }
}