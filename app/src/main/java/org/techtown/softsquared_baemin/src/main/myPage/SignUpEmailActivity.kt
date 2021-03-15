package org.techtown.softsquared_baemin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityLoginBinding
import org.techtown.softsquared_baemin.databinding.ActivitySignUpEmailBinding

class SignUpEmailActivity : BaseActivity<ActivitySignUpEmailBinding>(ActivitySignUpEmailBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.activitySignUpEmailBack.setOnClickListener {
            finish()
        }
        // SignUpEmailActivity 종료

        binding.activitySignUpEmailTest.setOnClickListener {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.activity_sign_up_email_sub, SIgnUpEmailFragment())
                    .commitAllowingStateLoss()
        }
        // Email 형식 맞으면 Fragment 추가





    }
}