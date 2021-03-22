package org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class UserDataEditResponse (

        @SerializedName("result") val result : String? = null

) : BaseResponse()