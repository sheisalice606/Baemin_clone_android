package org.techtown.softsquared_baemin.src.main.myPage.signUp.emailDuplicateModels

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class EmailDuplicateResponse(

        @SerializedName("result") val result : String? = null

) : BaseResponse()