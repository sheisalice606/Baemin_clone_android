package org.techtown.softsquared_baemin.src.main.search

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentSearchBinding

class SearchFragment :
    BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::bind, R.layout.fragment_search) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val searchItemList = ArrayList<SearchData>()
        searchItemList.add(SearchData(1, "이디야커피", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(2, "크로플", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(3, "설빙", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(4, "아마스빈", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(5, "동대문엽기떡볶이", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(6, "케이크", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(7, "마카롱", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(8, "커피", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(9, "메가커피", R.drawable.fragment_search_down_icon))
        searchItemList.add(SearchData(10, "꽈배기", R.drawable.fragment_search_new_icon))
        searchItemList.add(SearchData(11, "와플", R.drawable.fragment_search_down_icon))
        searchItemList.add(SearchData(12, "60계치킨", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(13, "빽다방", R.drawable.fragment_search_down_icon))
        searchItemList.add(SearchData(14, "투썸플레이스", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(15, "쥬씨", R.drawable.fragment_search_new_icon))
        searchItemList.add(SearchData(16, "베스킨라빈스", R.drawable.fragment_search_down_icon))
        searchItemList.add(SearchData(17, "네네치킨", R.drawable.fragment_search_upper_icon))
        searchItemList.add(SearchData(18, "컴포즈", R.drawable.fragment_search_new_icon))
        searchItemList.add(SearchData(19, "빙수", R.drawable.fragment_search_new_icon))
        searchItemList.add(SearchData(20, "도넛", R.drawable.fragment_search_new_icon))

        val searchAdapter = SearchAdapter(this.requireContext(), searchItemList)
        binding.fragmentSearchRecycler.adapter = searchAdapter



    }

}