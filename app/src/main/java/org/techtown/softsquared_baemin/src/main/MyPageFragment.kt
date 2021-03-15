package org.techtown.softsquared_baemin.src.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyPageBinding
import org.techtown.softsquared_baemin.src.main.adapter.MyPageAdapter1
import org.techtown.softsquared_baemin.src.main.adapter.MyPageAdapter2
import org.techtown.softsquared_baemin.src.main.adapterData.MyPageData1
import org.techtown.softsquared_baemin.src.main.adapterData.MyPageData2
import org.techtown.softsquared_baemin.src.main.myPage.LogInActivity
import org.techtown.softsquared_baemin.src.main.myPage.MainActivity

class MyPageFragment :
    BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items1 = ArrayList<MyPageData1>()
        val items2 = ArrayList<MyPageData2>()

        items1.add(MyPageData1("배민페이 등록", "배민페이로 결제하면 최대 5.5% 배민포인트가 적립됩니다!"))
        items1.add(MyPageData1("가족계정 관리", "결제수단을 공유해 우리 가족의 끼니를 챙겨주세요"))
        // 텍스트 하드코딩

        val adapter1 = MyPageAdapter1(this.requireContext(), items1)
        binding.myPageList1.adapter = adapter1
        // 첫번째 리사이클러 뷰 어댑터 연결

        items2.add(MyPageData2("선물하기"))
        items2.add(MyPageData2("공지사항"))
        items2.add(MyPageData2("배민커넥트 지원"))
        items2.add(MyPageData2("이벤트"))
        items2.add(MyPageData2("고객센터"))
        items2.add(MyPageData2("환경설정"))
        items2.add(MyPageData2("약관 및 정책"))
        items2.add(MyPageData2("현재 버전 10.23.1"))
        // 메뉴 하드코딩


        val adapter2 = MyPageAdapter2(this.requireContext(), items2)
        binding.myPageList2.adapter = adapter2
        // 두번째 리사이클러 뷰 어댑터 연결


        binding.beforeLoginMyPageImg2.setOnClickListener {

            val intent = Intent((activity as MainActivity), LogInActivity::class.java)
            startActivity(intent)

        }
        // 로그인 하기 -> LogInActivity

    }
}