package org.techtown.softsquared_baemin.src.main.myPage

import org.techtown.softsquared_baemin.src.main.myPage.models.EmailDuplicateResponse

interface EmailDuplicateView {

    fun onEmailDuplicateSuccess(responsePost : EmailDuplicateResponse)
    // 이메일 중복 체크 성공

    fun onEmailDuplicateFailure(message : String)
    // 이메일 중복 체크 실패

}