package org.techtown.softsquared_baemin.src.main.location.inputLocation

import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName

data class InputLoactionResponse(

        @SerializedName("response") val response: JsonArray

)