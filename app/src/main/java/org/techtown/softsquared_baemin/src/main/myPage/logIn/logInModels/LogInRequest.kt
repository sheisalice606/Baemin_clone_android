package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import com.google.gson.annotations.SerializedName

data class LogInRequest(

        @SerializedName("email") val email: String,
        @SerializedName("password") val password: String

)