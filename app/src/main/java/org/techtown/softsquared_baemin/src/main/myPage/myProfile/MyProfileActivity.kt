package org.techtown.softsquared_baemin.src.main.myPage.myProfile

import android.content.Intent
import android.os.Bundle
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityMyProfileBinding
import org.techtown.softsquared_baemin.src.main.MainActivity
import org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels.UserDataEditRequest
import org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels.UserDataEditResponse
import org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels.UserDataEditService
import org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels.UserDataEditView

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(ActivityMyProfileBinding::inflate), UserDataEditView{

    lateinit var nickname : String
    lateinit var password : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // MyProfileActivity 종료
        binding.activityMyProfileBack.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



        // Logout 및 MyProfileActivity 종료
        binding.activityMyProfileLogOut.setOnClickListener {

            val editor = sSharedPreferences.edit()
            editor.putBoolean("LOGIN_STATE", false)
            // 로그아웃 상태 전환

            editor.putString("user_email", null)
            //editor.putString("user_password", null)
            editor.putString("user_nickname", null)
            editor.putString("user_phoneNumber", null)
            editor.putString("user_birth", null)
            editor.apply()
            // 접속중인 유저 정보 초기화


            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }






        // 닉네임 표기
        binding.activityMyProfileUserNickname
                .setText(sSharedPreferences.getString("user_nickname", "blank"))

        // 이메일 표기
        binding.activityMyProfileUserEmail.text =
                sSharedPreferences.getString("user_email", "blank")


        // 전화번호 표기
        val userPhoneNumber = sSharedPreferences.getString("user_phoneNumber", "blank")
        if(userPhoneNumber != "blank") {
            binding.activityMyProfileUserPhoneNumber1.text = userPhoneNumber?.substring(0..2)
            binding.activityMyProfileUserPhoneNumber2.text = userPhoneNumber?.substring(4..7)
            binding.activityMyProfileUserPhoneNumber3.text = userPhoneNumber?.substring(9 until userPhoneNumber.length)
        }



        binding.activityMyProfileChangeCommit.setOnClickListener {

            nickname = binding.activityMyProfileUserNickname.text.toString()
            password = binding.activityMyProfileUserPassword.text.toString()


            //val userDataEditRequest = UserDataEditRequest(nickname, password)
            //UserDataEditService(this).tryUserDataEdit(userDataEditRequest)

        }
    }







    override fun onBackPressed() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }


    override fun onUserDataEditSuccess(responsePost: UserDataEditResponse) {
        if(responsePost.isSuccess) {
            val editor = sSharedPreferences.edit()
            editor.putString("user_nickname", nickname)
            //editor.putString("user_password", password)
            editor.apply()

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            showCustomToast("회원정보 수정 실패")
        }
    }


    override fun onUserDataEditFailure(message: String) {
        showCustomToast(message)
    }



}