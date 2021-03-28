package org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels

import com.google.gson.annotations.SerializedName

data class PostSignUpResponse(

        @SerializedName("isSuccess") val isSuccess: Boolean,
        @SerializedName("code") val code: Int,
        @SerializedName("message") val message: String

)