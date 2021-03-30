package org.techtown.softsquared_baemin.src.main.location.inputLocation

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface InputLocationRetrofitInterface {

    @POST("/app/users/useraddress")
    fun inputLocation(
            @Query("address") address : String,
            @Query("longitude") longitude : Double,
            @Query("latitude") latitude : Double,
            @Query("addressDetail") addressDetail : String
    ) : Call<InputLocationResponse>
    // 유저 주소 입력 POST API Request

}