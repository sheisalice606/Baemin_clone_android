package org.techtown.softsquared_baemin.src.main.search.searchWord

import retrofit2.Call
import retrofit2.http.GET

interface SearchWordRetrofitInterface {

    @GET("app/main/popular")
    fun searchWord() : Call<SearchWordResponse>

}