package org.techtown.softsquared_baemin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentMyPageBeforeLoginBinding
import org.techtown.softsquared_baemin.src.main.MainActivity
import org.techtown.softsquared_baemin.src.main.myPage.logIn.LogInActivity

class MyPageBeforeLogInFragment :
    BaseFragment<FragmentMyPageBeforeLoginBinding>(FragmentMyPageBeforeLoginBinding::bind, R.layout.fragment_my_page_before_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items1 = ArrayList<MyPageDataTop>()
        val items2 = ArrayList<MyPageDataBottom>()

        items1.add(MyPageDataTop("배민페이 등록", "배민페이로 결제하면 최대 5.5% 배민포인트가 적립됩니다!"))
        items1.add(MyPageDataTop("가족계정 관리", "결제수단을 공유해 우리 가족의 끼니를 챙겨주세요"))
        // 텍스트 하드코딩

        val adapter1 = MyPageAdapterTop(this.requireContext(), items1)
        binding.fragmentMyPageBeforeLoginList1.adapter = adapter1
        // 첫번째 리사이클러 뷰 어댑터 연결

        items2.add(MyPageDataBottom("선물하기"))
        items2.add(MyPageDataBottom("공지사항"))
        items2.add(MyPageDataBottom("배민커넥트 지원"))
        items2.add(MyPageDataBottom("이벤트"))
        items2.add(MyPageDataBottom("고객센터"))
        items2.add(MyPageDataBottom("환경설정"))
        items2.add(MyPageDataBottom("약관 및 정책"))
        items2.add(MyPageDataBottom("현재 버전 10.23.1"))
        // 메뉴 하드코딩


        val adapter2 = MyPageAdapterBottom(this.requireContext(), items2)
        binding.fragmentMyPageBeforeLoginList2.adapter = adapter2
        // 두번째 리사이클러 뷰 어댑터 연결


        binding.fragmentMyPageBeforeLoginLogin.setOnClickListener {

            val intent = Intent((activity as MainActivity), LogInActivity::class.java)
            startActivity(intent)
            (activity as MainActivity).finish()

        }
        // 로그인 하기 -> LogInActivity

    }
}