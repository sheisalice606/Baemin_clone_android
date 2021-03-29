package org.techtown.softsquared_baemin.src.main.search.searchWord

import com.google.gson.annotations.SerializedName
import org.techtown.softsquared_baemin.config.BaseResponse

data class SearchWordResponse (

    @SerializedName("result") val result : ArrayList<SearchUnit>

) : BaseResponse()