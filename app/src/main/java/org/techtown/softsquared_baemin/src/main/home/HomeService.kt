package org.techtown.softsquared_baemin.src.main.home

import org.techtown.softsquared_baemin.config.ApplicationClass
import org.techtown.softsquared_baemin.src.main.home.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.home.models.SignUpResponse
import org.techtown.softsquared_baemin.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeService(val view: HomeFragmentView) {

    // 로그인을 위한 tryGetUsers 메서드

    fun tryGetUsers(){

        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)

        homeRetrofitInterface.getUsers().enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                // 통신에 성공한 상황
                view.onGetUserSuccess(response.body() as UserResponse)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                // 통신 오류가 난 상황
                view.onGetUserFailure(t.message ?: "통신 오류")
            }
        })

    }


    // 회원가입을 위한 tryPostSignUP 메서드

    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest){

        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)

        homeRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<SignUpResponse>{


            override fun onResponse(call: Call<SignUpResponse>, response: Response<SignUpResponse>) {
                // 통신에 성공한 상황
                view.onPostSignUpSuccess(response.body() as SignUpResponse)
            }

            override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
                // 통신 오류가 난 상황
                view.onPostSignUpFailure(t.message ?: "통신 오류")
            }

        })

    }


}
