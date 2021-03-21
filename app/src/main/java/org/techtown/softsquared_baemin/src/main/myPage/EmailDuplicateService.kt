package org.techtown.softsquared_baemin.src.main.myPage

import org.techtown.softsquared_baemin.config.ApplicationClass
import org.techtown.softsquared_baemin.src.main.myPage.models.EmailDuplicateRequest
import android.util.Log
import org.techtown.softsquared_baemin.src.main.myPage.models.EmailDuplicateResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmailDuplicateService(val view : EmailDuplicateView) {

    fun tryEmailDuplicate(emailDuplicateRequest : EmailDuplicateRequest) {

        val signUpRetrofitInterface = ApplicationClass.sign_up_Retrofit.create(EmailDuplicateRetrofitInterface::class.java)

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