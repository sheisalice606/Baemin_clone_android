package org.techtown.softsquared_baemin.src.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivitySplashBinding
import org.techtown.softsquared_baemin.src.main.myPage.MainActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1500)
    }
}