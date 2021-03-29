package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import org.techtown.softsquared_baemin.config.ApplicationClass
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LogInService(val view : LogInView) {

    fun tryLogIn(logInRequest : LogInRequest) {

        val logInRetrofitInterface = ApplicationClass.mRetrofit.create(LogInRetrofitInterface::class.java)

        logInRetrofitInterface.logIn(logInRequest).enqueue(object : Callback<LogInResponse> {

            override fun onResponse(call: Call<LogInResponse>, response: Response<LogInResponse>) {
                view.onLogInSuccess(response.body() as LogInResponse)
            }

            override fun onFailure(call: Call<LogInResponse>, t: Throwable) {
                view.onLogInFailure("통신 오류")
            }

        })

    }

}