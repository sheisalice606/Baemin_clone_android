package org.techtown.softsquared_baemin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityLoginBinding

class LogInActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.activityLoginBack.setOnClickListener {
            finish()
        }
        // LoginActivity 종료

        binding.activityLoginSignUp.setOnClickListener {
            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
        // SignUpActivity
    }

}