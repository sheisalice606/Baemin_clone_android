package org.techtown.softsquared_baemin.src.main.myPage

import org.techtown.softsquared_baemin.src.main.myPage.models.PostSignUpResponse

interface PostSignUpView {

    fun onPostSignUpSuccess(responsePost: PostSignUpResponse)
    // 회원가입 통신 성공

    fun onPostSignUpFailure(message: String)
    // 회원가입 통신 오류

}