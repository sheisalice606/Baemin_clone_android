package org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PUT

interface UserDataEditRetrofitInterface {

    @PUT("api/v1/member")
    fun userDataEdit(@Body params : UserDataEditRequest) : Call<UserDataEditResponse>

}