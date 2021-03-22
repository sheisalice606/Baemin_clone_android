package org.techtown.softsquared_baemin.src.main.myPage.signUp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.text.Editable
import android.text.TextWatcher
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.ApplicationClass
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivitySignUpPhoneBinding
import org.techtown.softsquared_baemin.src.main.myPage.logIn.LogInActivity

class SignUpPhoneActivity : BaseActivity<ActivitySignUpPhoneBinding>(ActivitySignUpPhoneBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var Input_state = false

        binding.activitySignUpPhoneInputNumber.addTextChangedListener(PhoneNumberFormattingTextWatcher())
        binding.activitySignUpPhoneInputNumber.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {
                // Nope
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Nope
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val phone = s.toString()

                if(phone.length >= 12) {
                    Input_state = true
                    binding.activitySignUpPhoneButton1.setImageResource(R.drawable.check_box_checked)
                    binding.activitySignUpPhoneNext.setTextColor(Color.parseColor("#000000"))
                }
                else {
                    Input_state = false
                    binding.activitySignUpPhoneButton1.setImageResource(0)
                    binding.activitySignUpPhoneNext.setTextColor(Color.parseColor("#CCCCCC"))
                }

            }

        })


        binding.activitySignUpPhoneBack.setOnClickListener { // 뒤로가기 버튼
            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }


        binding.activitySignUpPhoneNext.setOnClickListener { // 확인 버튼
            if(Input_state) {
                val intent = Intent(applicationContext, SignUpEmailActivity::class.java)
                val editor = ApplicationClass.sSharedPreferences.edit()
                editor.putString("signUp_phoneNumber", binding.activitySignUpPhoneInputNumber.text.toString())
                editor.apply()
                startActivity(intent)
                finish()
            }
        }

    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }

}