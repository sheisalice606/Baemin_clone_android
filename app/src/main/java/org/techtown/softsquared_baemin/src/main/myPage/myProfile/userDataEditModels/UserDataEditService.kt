package org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels

import org.techtown.softsquared_baemin.config.ApplicationClass
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserDataEditService(val view : UserDataEditView) {

    fun tryUserDataEdit(userDataEditRequest : UserDataEditRequest) {

        val userDataEditRetrofitInterface = ApplicationClass.mRetrofit.create(UserDataEditRetrofitInterface::class.java)

        userDataEditRetrofitInterface.userDataEdit(userDataEditRequest).enqueue(object : Callback<UserDataEditResponse> {

            override fun onResponse(call: Call<UserDataEditResponse>, response: Response<UserDataEditResponse>) {
                Log.d("Hello", response.body().toString())
                //view.onUserDataEditSuccess(response.body() as UserDataEditResponse)
            }

            override fun onFailure(call: Call<UserDataEditResponse>, t: Throwable) {
                view.onUserDataEditFailure("통신 오류")
            }

        })


    }
}