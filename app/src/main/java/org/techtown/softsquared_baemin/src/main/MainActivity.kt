package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityMainBinding
import org.techtown.softsquared_baemin.src.main.myHome.MyHomeFragment
import org.techtown.softsquared_baemin.src.main.History.HistoryFragment
import org.techtown.softsquared_baemin.src.main.Love.LoveFragment
import org.techtown.softsquared_baemin.src.main.search.SearchFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyHomeFragment()).commitAllowingStateLoss()

        binding.mainBtmNav.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {

                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyHomeFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.menu_main_btm_nav_search -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, SearchFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.menu_main_btm_nav_love -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, LoveFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.menu_main_btm_nav_history -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HistoryFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }

                    R.id.menu_main_btm_nav_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }

                }
                false
            })
    }
}