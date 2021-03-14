package org.techtown.softsquared_baemin.src.main.home

import org.techtown.softsquared_baemin.src.main.home.models.PostSignUpRequest
import org.techtown.softsquared_baemin.src.main.home.models.SignUpResponse
import org.techtown.softsquared_baemin.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface HomeRetrofitInterface {

    @GET("/users")
    fun getUsers() : Call<UserResponse>
    // 로그인 메서드 getUsers()

    @POST("/users")
    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>
    // 회원가입 메서드 postSignUp()

}
