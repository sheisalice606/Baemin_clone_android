package org.techtown.softsquared_baemin.src.main.location.inputLocation

import com.google.gson.annotations.SerializedName

data class InputLocationRequest(

        @SerializedName("address") val address: String,
        @SerializedName("longitude") val longitude: Double,
        @SerializedName("latitude") val latitude: Double,
        @SerializedName("addressDetail") val addressDetail: String

)