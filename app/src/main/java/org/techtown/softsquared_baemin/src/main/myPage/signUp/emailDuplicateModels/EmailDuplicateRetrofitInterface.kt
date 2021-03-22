package org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels

import retrofit2.Call
import retrofit2.http.*

interface EmailDuplicateRetrofitInterface {

    @POST("/api/v1/signUp/verify/email")
    fun emailDuplicate(@Body params : EmailDuplicateRequest) : Call<EmailDuplicateResponse>
    // 이메일 정보

}