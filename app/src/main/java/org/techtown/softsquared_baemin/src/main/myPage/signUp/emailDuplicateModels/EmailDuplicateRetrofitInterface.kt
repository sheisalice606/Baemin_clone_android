package org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels

import retrofit2.Call
import retrofit2.http.*

interface EmailDuplicateRetrofitInterface {

    @GET("/app/users")
    fun emailDuplicate(@Query("email") email : String) : Call<EmailDuplicateResponse>
    // 이메일 정보

}