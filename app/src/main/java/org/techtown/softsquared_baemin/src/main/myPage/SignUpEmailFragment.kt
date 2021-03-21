package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSignUpEmailBinding

class SignUpEmailFragment :
        BaseFragment<FragmentSignUpEmailBinding>(FragmentSignUpEmailBinding::bind, R.layout.fragment_sign_up_email) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var next_state : Boolean = false

        var nickname_state : Boolean = false
        var password_state : Boolean = false
        var birth_state : Boolean = false




        binding.fragmentSignUpEmailNickname.addTextChangedListener(object : TextWatcher{

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().length in 2..10) {
                    nickname_state = true
                    binding.fragmentSignUpEmailNicknameCheck.setImageResource(R.drawable.check_box_checked)
                }
                else {
                    nickname_state = false
                    binding.fragmentSignUpEmailNicknameCheck.setImageResource(0)
                }
            }

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        }) // 닉네임 입력





        binding.fragmentSignUpEmailPassword.addTextChangedListener(object : TextWatcher{

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().isNotEmpty()) {
                    password_state = true
                    binding.fragmentSignUpEmailPasswordCheck.setImageResource(R.drawable.check_box_checked)
                }
                else {
                    password_state = false
                    binding.fragmentSignUpEmailPasswordCheck.setImageResource(0)
                }
            }

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        }) // 비밀번호 입력




        binding.fragmentSignUpEmailBirth.addTextChangedListener(object : TextWatcher{

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().isNotEmpty()) {
                    birth_state = true
                    binding.fragmentSignUpEmailBirthCheck.setImageResource(R.drawable.check_box_checked)
                }
                else {
                    birth_state = false
                    binding.fragmentSignUpEmailBirthCheck.setImageResource(0)
                }
            }

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        }) // 생년월일 입력




    }
}