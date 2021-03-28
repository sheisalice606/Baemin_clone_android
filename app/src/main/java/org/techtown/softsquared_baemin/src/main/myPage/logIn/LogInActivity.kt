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
            // 로그인 상황
            editor.putString("X-ACCESS-TOKEN", responsePost.result.jwt)
            // 토큰값을 넣어서 로그인 상태임을 확인

            editor.putString("user_email", responsePost.result.user.email.toString())
            // 로그인된 이메일값 저장
            editor.putString("user_nickname", responsePost.result.user.nickname)
            // 로그인된 닉네임값 저장
            editor.putString("user_tel", responsePost.result.user.tel)
            // 로그인된 전화번호값 저장
            editor.putString("user_birth", responsePost.result.user.birth)
            // 로그인된 생년월일값 저장
            editor.apply()

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            showCustomToast(responsePost.message.toString())
        }

    }

    override fun onLogInFailure(message: String) {

        val editor = sSharedPreferences.edit()
        editor.apply()

        showCustomToast(message)

    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}