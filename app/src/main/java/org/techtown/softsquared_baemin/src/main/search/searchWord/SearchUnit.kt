package org.techtown.softsquared_baemin.src.main.search.searchWord

import com.google.gson.annotations.SerializedName

data class SearchUnit (

    @SerializedName("searchWord") val searchWord : String,
    @SerializedName("searchNum") val searchNum : Int

)