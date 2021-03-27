package org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels

import org.techtown.softsquared_baemin.config.ApplicationClass
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmailDuplicateService(val view : EmailDuplicateView) {

    fun tryEmailDuplicate(email : String) {

        val signUpRetrofitInterface = ApplicationClass.mRetrofit.create(EmailDuplicateRetrofitInterface::class.java)

        signUpRetrofitInterface.emailDuplicate(email).enqueue(object : Callback<EmailDuplicateResponse> {

            override fun onResponse(call: Call<EmailDuplicateResponse>, response: Response<EmailDuplicateResponse>) {
                Log.d("Hello", response.body().toString())
                view.onEmailDuplicateSuccess(response.body() as EmailDuplicateResponse)
            }

            override fun onFailure(call: Call<EmailDuplicateResponse>, t: Throwable) {
                view.onEmailDuplicateFailure("")
            }

        })

    }
}