package org.techtown.softsquared_baemin.src.main.myPage

import org.techtown.softsquared_baemin.config.ApplicationClass
import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpResponse
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostSignUpService(val view : PostSignUpView) {


    // 회원가입을 위한 tryPostSignUp() 메서드
    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest) {

        val signUpRetrofitInterface = ApplicationClass.sign_up_Retrofit.create(PostSignUpRetrofitInterface::class.java)

        signUpRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<PostSignUpResponse> {

            override fun onResponse(call: Call<PostSignUpResponse>, responsePost: Response<PostSignUpResponse>) {
                view.onPostSignUpSuccess(responsePost.body() as PostSignUpResponse)
            }

            override fun onFailure(call: Call<PostSignUpResponse>, t: Throwable) {
                view.onPostSignUpFailure("통신 오류")
            }

        })
    }


}