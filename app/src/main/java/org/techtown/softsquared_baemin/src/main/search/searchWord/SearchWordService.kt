package org.techtown.softsquared_baemin.src.main.search.searchWord

import org.techtown.softsquared_baemin.config.ApplicationClass
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchWordService(val view : SearchWordView) {

    fun trySearchWord() {

        Log.d("Hello", "호출 확인")
        val searchWordRetrofitInterface = ApplicationClass.mRetrofit.create(SearchWordRetrofitInterface::class.java)


        searchWordRetrofitInterface.searchWord().enqueue(object : Callback<SearchWordResponse> {


            override fun onResponse(call: Call<SearchWordResponse>, response: Response<SearchWordResponse>) {
                Log.d("Hello", "onResponse() 호출 확인")
                view.onSearchWordSuccess(response.body() as SearchWordResponse)
            }

            override fun onFailure(call: Call<SearchWordResponse>, t: Throwable) {
                Log.d("Hello", "onFailure() 호출 확인")
                view.onSearchWordFailure("통신 실패")
            }

        })
    }

}