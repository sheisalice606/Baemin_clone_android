package org.techtown.softsquared_baemin.src.main.myPage.models

import com.google.gson.annotations.SerializedName

data class EmailDuplicateRequest (
        // 이메일
        @SerializedName("email") val email: String

)
