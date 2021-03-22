package org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels

import org.techtown.softsquared_baemin.config.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostSignUpService(val view : PostSignUpView) {


    // 회원가입을 위한 tryPostSignUp() 메서드
    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest) {

        val signUpRetrofitInterface = ApplicationClass.mRetrofit.create(PostSignUpRetrofitInterface::class.java)

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