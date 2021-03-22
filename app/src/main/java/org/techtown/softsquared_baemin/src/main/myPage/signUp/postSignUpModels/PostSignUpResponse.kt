package org.techtown.softsquared_baemin.src.main.myPage.signUp.postSignUpModels

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class PostSignUpResponse(

        // 베이스 리스폰스를 상속 받았으므로, 아래 내용은 포함이 되었습니다.
        // @SerializedName("isSuccess") val isSuccess: Boolean,
        // @SerializedName("code") val code: Int,
        // @SerializedName("message") val message: String,
        @SerializedName("result") val result : String? = null

) : BaseResponse()