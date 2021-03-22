package org.techtown.softsquared_baemin.src.main.myPage.logIn.logInModels

interface LogInView {

    fun onLogInSuccess(responsePost : LogInResponse)
    // 로그인 통신 성공

    fun onLogInFailure(message : String)
    // 로그인 통신 오류
}