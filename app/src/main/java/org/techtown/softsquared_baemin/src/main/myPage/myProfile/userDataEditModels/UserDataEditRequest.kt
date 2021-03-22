package org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels

import com.google.gson.annotations.SerializedName

data class UserDataEditRequest (

        @SerializedName("nickname") val nickname: String,
        @SerializedName("password") val password: String

)