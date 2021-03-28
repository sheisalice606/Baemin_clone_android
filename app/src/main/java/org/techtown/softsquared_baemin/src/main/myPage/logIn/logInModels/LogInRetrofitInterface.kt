package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LogInRetrofitInterface {

    @POST("app/users/login")
    fun logIn(@Body params : LogInRequest) : Call<LogInResponse>

}