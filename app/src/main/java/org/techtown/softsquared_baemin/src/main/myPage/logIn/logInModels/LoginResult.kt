package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import com.google.gson.annotations.SerializedName

data class LoginResult (

    @SerializedName("user") val user: LoginUser,
    @SerializedName("jwt") val jwt: String

)