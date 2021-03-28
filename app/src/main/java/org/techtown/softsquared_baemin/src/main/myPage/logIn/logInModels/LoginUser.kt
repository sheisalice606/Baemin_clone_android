package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import com.google.gson.annotations.SerializedName

data class LoginUser (

    @SerializedName("userIndex") val userIndex: Int,
    @SerializedName("tel") val tel: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("nickname") val nickname: String,
    @SerializedName("birth") val birth: String,
    @SerializedName("grade") val grade: String,
    @SerializedName("point") val point: Int,
    @SerializedName("isDeleted") val isDeleted: String,
    @SerializedName("status") val status: String? = null

)