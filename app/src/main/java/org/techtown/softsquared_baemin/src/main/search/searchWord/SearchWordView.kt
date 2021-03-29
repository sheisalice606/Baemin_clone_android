package org.techtown.softsquared_baemin.src.main.search.searchWord

interface SearchWordView {

    fun onSearchWordSuccess(response : SearchWordResponse)

    fun onSearchWordFailure(message : String)

}