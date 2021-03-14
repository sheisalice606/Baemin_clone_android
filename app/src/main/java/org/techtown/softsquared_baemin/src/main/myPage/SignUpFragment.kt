package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_login.view.*
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSignUpBinding

class SignUpFragment :
        BaseFragment<FragmentSignUpBinding>(FragmentSignUpBinding::bind, R.layout.fragment_sign_up){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentSignUpBack.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commitAllowingStateLoss()
        }


    }
}