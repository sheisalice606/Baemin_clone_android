package org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels

import com.google.gson.annotations.SerializedName

data class PostSignUpRequest(

        // 회원가입 정보
        @SerializedName("email") val email: String,
        @SerializedName("nickname") val nickname: String,
        @SerializedName("password") val password: String,
        @SerializedName("birth") val birth: String,
        @SerializedName("tel") val tel: String

)