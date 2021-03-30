package org.techtown.softsquared_baemin.src.main.location.inputLocation

import com.google.gson.annotations.SerializedName

data class LocationMessage (

        @SerializedName("isSuccess") val isSuccess : Boolean,
        @SerializedName("code") val code : Int,
        @SerializedName("message") val message : String
)