package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentLoginBinding

class LogInFragment :
        BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::bind, R.layout.fragment_login){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fragmentLoginBack.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commitAllowingStateLoss()
            // X -> Back Button
        }

        binding.fragmentLoginSignUp.setOnClickListener {
            val fragment = SignUpFragment()
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.main_frm, fragment)?.commitAllowingStateLoss()
            // 회원가입 -> SignUp Page
        }

    }
}
