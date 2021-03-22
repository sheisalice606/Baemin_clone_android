package org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels

import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels.PostSignUpResponse
import retrofit2.Call
import retrofit2.http.*

interface PostSignUpRetrofitInterface {

    @POST("/api/v1/signUp")
    fun postSignUp(@Body params : PostSignUpRequest) : Call<PostSignUpResponse>
    // 회원 가입

}