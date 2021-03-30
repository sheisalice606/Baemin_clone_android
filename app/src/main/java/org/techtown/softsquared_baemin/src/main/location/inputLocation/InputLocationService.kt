package org.techtown.softsquared_baemin.src.main.location.inputLocation

import org.techtown.softsquared_baemin.config.ApplicationClass
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InputLocationService(val view : InputLocationView) {


    fun tryInputLocation(address : String, longitude : Double, latitude : Double, addressDetail : String) {

        val inputLocationRetrofitInterface = ApplicationClass.mRetrofit.create(InputLocationRetrofitInterface::class.java)

        inputLocationRetrofitInterface.inputLocation(address, longitude, latitude, addressDetail)
                .enqueue(object : Callback<InputLocationResponse> {

                    override fun onFailure(call: Call<InputLocationResponse>, t: Throwable) {
                        view.onInputLocationFailure("통신 오류")
                        Log.d("Hello", t.toString())
                    }

                    override fun onResponse(call: Call<InputLocationResponse>, response: Response<InputLocationResponse>) {
                        view.onInputLocationSuccess(response.body() as InputLocationResponse)
                        Log.d("Hello", response.body().toString())
                    }


                })
    }

}