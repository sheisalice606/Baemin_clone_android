package org.techtown.softsquared_baemin.src.main.category

import android.os.Bundle
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityCategoryBinding

class CategoryActivity : BaseActivity<ActivityCategoryBinding>(ActivityCategoryBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.activityCategoryBack.setOnClickListener {
            finish()
        }

    }

}