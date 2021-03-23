package org.techtown.softsquared_baemin.src.main.category

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.tabs.TabLayout
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityCategoryBinding
import org.techtown.softsquared_baemin.src.main.category.asian.AsianFragment
import org.techtown.softsquared_baemin.src.main.category.cafe.CafeFragment
import org.techtown.softsquared_baemin.src.main.category.chicken.ChickenFragment
import org.techtown.softsquared_baemin.src.main.category.china.ChinaFragment
import org.techtown.softsquared_baemin.src.main.category.fastFood.FastFoodFragment
import org.techtown.softsquared_baemin.src.main.category.japan.JapanFragment
import org.techtown.softsquared_baemin.src.main.category.korea.KoreaFragment
import org.techtown.softsquared_baemin.src.main.category.lunchBox.LunchBoxFragment
import org.techtown.softsquared_baemin.src.main.category.night.NightFragment
import org.techtown.softsquared_baemin.src.main.category.pizza.PizzaFragment
import org.techtown.softsquared_baemin.src.main.category.pork.PorkFragment
import org.techtown.softsquared_baemin.src.main.category.snack.SnackFragment
import org.techtown.softsquared_baemin.src.main.category.steamed.SteamedFragment

class CategoryActivity : BaseActivity<ActivityCategoryBinding>(ActivityCategoryBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.activityCategoryBack.setOnClickListener {
            finish()
            // Activity 종료
        }









        val intent = intent

        val pageNum = intent.getIntExtra("pageNum", 0)
        val pageName = arrayOf(
                "한식", "분식", "돈까스·회·일식", "치킨", "피자", "아시안·양식",
                "중국집", "족발·보쌈", "야식", "찜·탕", "도시락", "카페·디저트",
                "패스트푸드"
        ) // Tab Page 순서 맞춤


        val page = arrayOf(
                KoreaFragment(), SnackFragment(), JapanFragment(), ChickenFragment(),
                PizzaFragment(), AsianFragment(), ChinaFragment(), PorkFragment(),
                NightFragment(), SteamedFragment(), LunchBoxFragment(), CafeFragment(),
                FastFoodFragment()
        ) // Tab Page 순서


        val handler = Handler(Looper.getMainLooper())
        handler.post {
            binding.activityCategoryTab.getTabAt(pageNum)?.select()
        }

        binding.activityCategoryName.text = pageName[pageNum]
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_category_frm, page[pageNum])
                .commitAllowingStateLoss()
        // 첫 화면 세팅










        binding.activityCategoryTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                val position = tab?.position
                // 카테고리 페이지 구분
                when(position) {

                    0 -> {
                        binding.activityCategoryName.text = "한식"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, KoreaFragment())
                                .commitAllowingStateLoss()
                    }

                    1 -> {
                        binding.activityCategoryName.text = "분식"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, SnackFragment())
                                .commitAllowingStateLoss()
                    }

                    2 -> {
                        binding.activityCategoryName.text = "돈까스·회·일식"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, JapanFragment())
                                .commitAllowingStateLoss()
                    }

                    3 -> {
                        binding.activityCategoryName.text = "치킨"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, ChickenFragment())
                                .commitAllowingStateLoss()
                    }

                    4 -> {
                        binding.activityCategoryName.text = "피자"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, PizzaFragment())
                                .commitAllowingStateLoss()
                    }

                    5 -> {
                        binding.activityCategoryName.text = "아시안·양식"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, AsianFragment())
                                .commitAllowingStateLoss()
                    }

                    6 -> {
                        binding.activityCategoryName.text = "중국집"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, ChinaFragment())
                                .commitAllowingStateLoss()
                    }

                    7 -> {
                        binding.activityCategoryName.text = "족발·보쌈"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, PorkFragment())
                                .commitAllowingStateLoss()
                    }

                    8 -> {
                        binding.activityCategoryName.text = "야식"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, NightFragment())
                                .commitAllowingStateLoss()
                    }

                    9 -> {
                        binding.activityCategoryName.text = "찜·탕"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, SteamedFragment())
                                .commitAllowingStateLoss()
                    }

                    10 -> {
                        binding.activityCategoryName.text = "도시락"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, LunchBoxFragment())
                                .commitAllowingStateLoss()
                    }

                    11 -> {
                        binding.activityCategoryName.text = "카페·디저트"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, CafeFragment())
                                .commitAllowingStateLoss()
                    }

                    12 -> {
                        binding.activityCategoryName.text = "패스트푸드"
                        supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.activity_category_frm, FastFoodFragment())
                                .commitAllowingStateLoss()
                    }

                }
            }
        })







    }

}