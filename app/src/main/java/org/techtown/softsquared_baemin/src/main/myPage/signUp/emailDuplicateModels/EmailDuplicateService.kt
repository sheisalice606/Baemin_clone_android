package org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels

import org.techtown.softsquared_baemin.config.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmailDuplicateService(val view : EmailDuplicateView) {

    fun tryEmailDuplicate(emailDuplicateRequest : EmailDuplicateRequest) {

        val signUpRetrofitInterface = ApplicationClass.mRetrofit.create(EmailDuplicateRetrofitInterface::class.java)

        signUpRetrofitInterface.emailDuplicate(emailDuplicateRequest).enqueue(object : Callback<EmailDuplicateResponse> {

            override fun onResponse(call: Call<EmailDuplicateResponse>, response: Response<EmailDuplicateResponse>) {
                view.onEmailDuplicateSuccess(response.body() as EmailDuplicateResponse)
            }

            override fun onFailure(call: Call<EmailDuplicateResponse>, t: Throwable) {
                view.onEmailDuplicateFailure("통신 오류")
            }

        })

    }
}