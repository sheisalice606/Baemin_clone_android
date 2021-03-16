package org.techtown.softsquared_baemin.src.main

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyHomeBinding

class MyHomeFragment :
        BaseFragment<FragmentMyHomeBinding>(FragmentMyHomeBinding::bind, R.layout.fragment_my_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}