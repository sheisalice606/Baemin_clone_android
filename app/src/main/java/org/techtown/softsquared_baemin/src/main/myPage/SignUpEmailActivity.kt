package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.duplicate_email_check
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivitySignUpEmailBinding
import org.techtown.softsquared_baemin.src.main.myPage.models.EmailDuplicateRequest
import org.techtown.softsquared_baemin.src.main.myPage.models.EmailDuplicateResponse
import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpResponse

class SignUpEmailActivity :
        BaseActivity<ActivitySignUpEmailBinding>(ActivitySignUpEmailBinding::inflate), EmailDuplicateView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent
        val phoneNumber = intent.getStringExtra("phoneNumber") as String

        var email : String = "email"
        var password : String = "password"
        var nickname : String = "nickname"
        var birth : String = "birth"


        // 회원 전화번호 정보 받아옴


        binding.activitySignUpEmailBack.setOnClickListener {
            finish()
        }
        // SignUpEmailActivity 종료


        binding.activitySignUpEmailTest.setOnClickListener {


            email = binding.activitySignUpEmailInput.text.toString()
            // 회원 Email 정보 받아옴

            val emailDuplicateRequest = EmailDuplicateRequest(email = email)
            EmailDuplicateService(this).tryEmailDuplicate(emailDuplicateRequest)
            // 받아온 Email 중복 체크

        }
        // Email 중복 체크 통과-> Fragment 등록



        binding.activitySignUpEmailNext.setOnClickListener {


        }
        // 회원가입 요청




    }

    override fun onEmailDuplicateSuccess(responsePost: EmailDuplicateResponse) {
        if(responsePost.isSuccess) {


            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.activity_sign_up_email_sub, SignUpEmailFragment())
                    .commitAllowingStateLoss()
            // 추가 입력창 생성
        }
        else {
            showCustomToast("이미 회원가입된 이메일입니다.")
        }
    }


    override fun onEmailDuplicateFailure(message: String) {
        showCustomToast(message)
    }


}