package org.techtown.softsquared_baemin.src.main.location.inputLocation

interface InputLocationView {

    fun onInputLocationSuccess(response : InputLocationResponse)

    fun onInputLocationFailure(message : String)

}