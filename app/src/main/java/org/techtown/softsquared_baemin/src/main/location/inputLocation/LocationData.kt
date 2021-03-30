package org.techtown.softsquared_baemin.src.main.location.inputLocation

import com.google.gson.annotations.SerializedName

data class LocationData (

        @SerializedName("fieldCount") val fieldCount : Int,
        @SerializedName("affectedRows") val affectedRows : Int,
        @SerializedName("insertId") val insetId : Int,
        @SerializedName("info") val info : String,
        @SerializedName("serverStatus") val serverStatus : Int,
        @SerializedName("warningStatus") val warningStatus : Int,
        @SerializedName("changedRows") val changedRows : Int

)