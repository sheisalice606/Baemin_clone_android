package org.techtown.softsquared_baemin.src.main.myPage.models

import com.google.gson.annotations.SerializedName

data class PostSignUpRequest(

        // 회원가입 정보
        @SerializedName("email") val email: String,
        @SerializedName("password") val password: String,
        @SerializedName("nickname") val nickname: String,
        @SerializedName("phoneNumber") val phoneNumber: String,
        @SerializedName("birth") val birth: String

)