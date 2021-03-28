package org.techtown.softsquared_baemin.src.main.location

import android.os.Bundle
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityInputLocationBinding

class InputLocationActivity :
        BaseActivity<ActivityInputLocationBinding>(ActivityInputLocationBinding::inflate){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.activityInputLocationBack.setOnClickListener {
            finish()
        }

    }


}