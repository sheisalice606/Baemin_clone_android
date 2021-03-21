package org.techtown.softsquared_baemin.src.main.myPage.models

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class EmailDuplicateResponse(

        @SerializedName("isSuccess") val isSuccess: Boolean = false,
        @SerializedName("code") val code: Int = 0,
        @SerializedName("message") val message: String? = null,
        @SerializedName("result") val result : String? = null

)