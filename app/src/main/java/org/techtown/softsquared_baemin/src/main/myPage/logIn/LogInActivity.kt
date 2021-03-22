package org.techtown.softsquared_baemin.src.main.myPage.logIn

import android.content.Intent
import android.os.Bundle
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityLoginBinding
import org.techtown.softsquared_baemin.src.main.MainActivity
import org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels.LogInRequest
import org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels.LogInResponse
import org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels.LogInService
import org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels.LogInView
import org.techtown.softsquared_baemin.src.main.myPage.signUp.SignUpActivity

class LogInActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate), LogInView {


    lateinit var email : String
    lateinit var password : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.activityLoginBack.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        // LoginActivity 종료


        binding.activityLoginSignUp.setOnClickListener {
            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }
        // SignUpActivity -> 회원가입하기



        binding.activityLoginLogin.setOnClickListener {
            email = binding.activityLoginId.text.toString()
            password = binding.activityLoginPassword.text.toString()

            val logInRequest = LogInRequest(email = email, password = password)
            LogInService(this).tryLogIn(logInRequest)
        }
        // Email, Password 로그인 시도


    }

    override fun onLogInSuccess(responsePost: LogInResponse) {

        if(responsePost.isSuccess) {
            val editor = sSharedPreferences.edit()
            editor.putBoolean("LOGIN_STATE", true)

            editor.putString("user_email", email)
            //editor.putString("user_password", password)
            editor.putString("user_nickname", null)
            editor.putString("user_phoneNumber", null)
            editor.putString("user_birth", null)
            editor.apply()

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            showCustomToast("잘못된 회원정보입니다.")
        }

    }

    override fun onLogInFailure(message: String) {

        val editor = sSharedPreferences.edit()
        editor.putBoolean("LOGIN_STATE", false)
        editor.apply()

        showCustomToast(message)

    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}