package org.techtown.softsquared_baemin.src.main.home

import org.techtown.softsquared_baemin.src.main.home.models.SignUpResponse
import org.techtown.softsquared_baemin.src.main.home.models.UserResponse

interface HomeFragmentView {

    fun onGetUserSuccess(response: UserResponse)

    fun onGetUserFailure(message: String)

    fun onPostSignUpSuccess(response: SignUpResponse)

    fun onPostSignUpFailure(message: String)
}