package org.techtown.softsquared_baemin.src.main.myPage.signUp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.content.ContextCompat
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.birth_check
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.email_check
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.nickname_check
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.password_check
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sign_up_available
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivitySignUpEmailBinding
import org.techtown.softsquared_baemin.src.main.MainActivity
import org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels.EmailDuplicateResponse
import org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels.EmailDuplicateService
import org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels.EmailDuplicateView
import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpResponse
import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpService
import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpView

class SignUpEmailActivity :
        BaseActivity<ActivitySignUpEmailBinding>(ActivitySignUpEmailBinding::inflate),
        EmailDuplicateView, PostSignUpView {


    var email : String = "email"
    var password : String = "password"
    var nickname : String = "nickname"
    var birth : String = "birth"

    private lateinit var tel : String
    // ???????????? ?????? ??????


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tel = sSharedPreferences.getString("signUp_phoneNumber", "blank").toString()

        // Nickname EditText
        binding.activitySignUpNicknameInput.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                nickname = s.toString()
                val len = s.toString().length
                if(len in 2..10) {

                    nickname_check = true
                    binding.activitySignUpNicknameCheck.setImageResource(R.drawable.sign_up_format_checked)

                    if(email_check && nickname_check && password_check && birth_check) {
                        binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.black))
                        sign_up_available = true
                    }

                }
                else {
                    nickname_check = false
                    sign_up_available = false
                    binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.grey))
                    binding.activitySignUpNicknameCheck.setImageResource(0)
                }
            }

        })


        // Password EditText
        binding.activitySignUpPasswordInput.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                password = s.toString()
                if(s.toString().isNotEmpty()) {
                    password_check = true
                    binding.activitySignUpPasswordCheck.setImageResource(R.drawable.sign_up_format_checked)

                    if(email_check && nickname_check && password_check && birth_check) {
                        binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.black))
                        sign_up_available = true
                    }

                }
                else {
                    password_check = false
                    sign_up_available = false
                    binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.grey))
                    binding.activitySignUpPasswordCheck.setImageResource(0)
                }
            }

        })


        // Birth EditText
        binding.activitySignUpBirthInput.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                birth = s.toString()
                if(s.toString().isNotEmpty()) {

                    birth_check = true
                    binding.activitySignUpBirthCheck.setImageResource(R.drawable.sign_up_format_checked)

                    if(email_check && nickname_check && password_check && birth_check) {
                        binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.black))
                        sign_up_available = true
                    }

                }
                else {
                    birth_check = false
                    sign_up_available = false
                    binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.grey))
                    binding.activitySignUpBirthCheck.setImageResource(0)
                }
            }

        })





        // <?????? ??????> ??????
        binding.activitySignUpEmailTest.setOnClickListener {

            email = binding.activitySignUpEmailInput.text.toString()
            // ?????? Email ?????? ?????????.

            EmailDuplicateService(this).tryEmailDuplicate(email = email)
            // ????????? Email ?????? ??????.

        }



        // <?????? ??????> ??????
        binding.activitySignUpEmailNext.setOnClickListener {

            if(sign_up_available) {
                val postSignUpRequest = PostSignUpRequest(email, nickname, password, birth, tel)
                // ?????? ???????????? ????????? ?????? PostSignUpRequest ?????????.
                PostSignUpService(this).tryPostSignUp(postSignUpRequest)
            }

        }





        binding.activitySignUpEmailBack.setOnClickListener {
            val intent = Intent(applicationContext, SignUpPhoneActivity::class.java)
            startActivity(intent)
            finish()
        }
        // SignUpEmailActivity ??????

    }



    override fun onEmailDuplicateSuccess(responsePost: EmailDuplicateResponse) {
        if(responsePost.isSuccess) {
            showCustomToast(responsePost.message.toString())
            email_check = true
            binding.activitySignUpEmailTest.background = ContextCompat.getDrawable(applicationContext, R.drawable.activity_sign_up_email_test_button)
            binding.activitySignUpEmailTest.setTextColor(getColorStateList(R.color.grey))

            if(email_check && nickname_check && password_check && birth_check) {
                binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.black))
                sign_up_available = true
            }
            else{
                binding.activitySignUpEmailNext.setTextColor(getColorStateList(R.color.grey))
                sign_up_available = false
            }
            // ?????? ?????? ??????
        }
        else {
            showCustomToast(responsePost.message.toString())
            email_check = false
            sign_up_available = false
            binding.activitySignUpEmailTest.background = ContextCompat.getDrawable(applicationContext, R.drawable.activity_sign_up_email_test_button_2)
            binding.activitySignUpEmailTest.setTextColor(getColorStateList(R.color.black))
        }
    }


    override fun onEmailDuplicateFailure(message: String) {
        showCustomToast(message)
    }





    override fun onPostSignUpSuccess(responsePost: PostSignUpResponse) {
        if(responsePost.isSuccess) {

            showCustomToast(responsePost.message)
            // ???????????? ?????? message
            val intent = Intent(applicationContext, MainActivity::class.java)
            // MainActivity ??? ??????

            email_check = false
            nickname_check = false
            password_check = false
            birth_check = false
            // Login ????????? ??????, ???????????? ???????????? ?????????

            val editor = sSharedPreferences.edit()
            editor.putBoolean("LOGIN_STATE", true)
            editor.putString("user_email", email)
            //editor.putString("user_password", password)
            editor.putString("user_nickname", nickname)
            editor.putString("user_tel", tel)
            editor.putString("user_birth", birth)
            editor.apply()

            Log.d("Hello", sSharedPreferences.getString("user_email", "blank").toString())
            Log.d("Hello", sSharedPreferences.getString("user_password", "blank").toString())
            Log.d("Hello", sSharedPreferences.getString("user_nickname", "blank").toString())
            Log.d("Hello", sSharedPreferences.getString("user_phoneNumber", "blank").toString())
            Log.d("Hello", sSharedPreferences.getString("user_birth", "blank").toString())
            // ??????????????? ????????? ???????????????.
            // ???????????? ????????? ????????? ????????????.

            startActivity(intent)
            finish()
        }
        else {
            showCustomToast(responsePost.message)
            // ???????????? ?????? message
        }
    }


    override fun onPostSignUpFailure(message: String) {
        showCustomToast(message)
        // ???????????? ?????? ?????????
    }




    override fun onBackPressed() {
        val intent = Intent(applicationContext, SignUpPhoneActivity::class.java)
        startActivity(intent)
        finish()
        // ???????????? ?????? -> ?????????????????? ?????? ???????????????.
    }

}