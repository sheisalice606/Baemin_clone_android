package org.techtown.softsquared_baemin.src.main.search

import android.os.Bundle
import android.view.View
import android.util.Log
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSearchBinding
import org.techtown.softsquared_baemin.src.main.search.searchWord.SearchUnit
import org.techtown.softsquared_baemin.src.main.search.searchWord.SearchWordResponse
import org.techtown.softsquared_baemin.src.main.search.searchWord.SearchWordService
import org.techtown.softsquared_baemin.src.main.search.searchWord.SearchWordView

class SearchFragment :
    BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::bind, R.layout.fragment_search), SearchWordView {


    private val searchWord = ArrayList<SearchUnit>()
    // GET API 를 옮겨담을 ArrayList


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        /*
        SearchWordService(this).trySearchWord()
        // API GET 실시간 검색어


        val searchItemList = ArrayList<SearchData>()
        Log.d("Hello", searchWord.size.toString())


        for(i in 0..searchWord.size) {
            searchItemList.add(SearchData(i+1, searchWord[i].searchWord, R.drawable.fragment_search_upper_icon))
        }

        val searchAdapter = SearchAdapter(this.requireContext(), searchItemList)
        binding.fragmentSearchRecycler.adapter = searchAdapter*/


    }

    override fun onSearchWordSuccess(response: SearchWordResponse) {
        Log.d("Hello", "실행")
        for(i in 0..response.result.size) {
            searchWord.add(response.result[i])
        } // 옮겨담기
    }

    override fun onSearchWordFailure(message: String) {
        showCustomToast(message)
    }

}