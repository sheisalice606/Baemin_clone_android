package org.techtown.softsquared_baemin.src.main.myPage.myProfile.userDataEditModels

interface UserDataEditView {

    fun onUserDataEditSuccess(responsePost : UserDataEditResponse)
    // 유저 데이터 수정 성공

    fun onUserDataEditFailure(message : String)
    // 유저 데이터 수정 성공

}