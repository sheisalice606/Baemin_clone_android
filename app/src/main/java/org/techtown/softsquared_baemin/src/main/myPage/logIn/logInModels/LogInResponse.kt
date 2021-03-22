package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class LogInResponse(

        @SerializedName("result") val result : String? = null

) : BaseResponse()