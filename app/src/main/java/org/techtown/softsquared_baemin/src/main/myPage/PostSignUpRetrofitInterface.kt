package org.techtown.softsquared_baemin.src.main.myPage

import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpResponse
import retrofit2.Call
import retrofit2.http.*

interface PostSignUpRetrofitInterface {

    @POST("/api/v1/signUp")
    fun postSignUp(@Body params : PostSignUpRequest) : Call<PostSignUpResponse>
    // 회원 가입

}