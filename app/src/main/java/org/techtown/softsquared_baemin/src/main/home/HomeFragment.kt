package org.techtown.softsquared_baemin.src.main.home

import android.os.Bundle
import android.util.Log
import android.view.View
import org.techtown.softsquared_baemin.src.main.home.HomeFragmentView
import org.techtown.softsquared_baemin.src.main.home.HomeService
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentHomeBinding
import org.techtown.softsquared_baemin.src.main.home.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.home.models.SignUpResponse
import org.techtown.softsquared_baemin.src.main.home.models.UserResponse

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home),
    HomeFragmentView {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeButtonTryGetJwt.setOnClickListener {
            showLoadingDialog(context!!)
            HomeService(this).tryGetUsers()
        }


        // 회원가입 하기
        binding.homeBtnTryPostHttpMethod.setOnClickListener {

            val email = binding.homeEtId.text.toString()
            // 입력한 이메일
            val password = binding.homeEtPw.text.toString()
            // 입력한 비밀번호

            val postRequest = PostSignUpRequest(email = email, password = password,
                    confirmPassword = password, nickname = "test", phoneNumber = "010-0000-0000")
            // PostSignUpRequest.kt 참조
            // PostSignUpRequest 생성자
            showLoadingDialog(context!!)
            // 로딩중

            HomeService(this).tryPostSignUp(postRequest)
            //HomeService 실행이동

        }
    }

    override fun onGetUserSuccess(response: UserResponse) {
        dismissLoadingDialog()
        for (User in response.result) {
            Log.d("HomeFragment", User.toString())
        }
        binding.homeButtonTryGetJwt.text = response.message
        showCustomToast("Get JWT 성공")
    }


    override fun onGetUserFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }


    override fun onPostSignUpSuccess(response: SignUpResponse) {
        dismissLoadingDialog()
        binding.homeBtnTryPostHttpMethod.text = response.message
        response.message?.let { showCustomToast(it) }
    }


    override fun onPostSignUpFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }
}