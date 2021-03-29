package org.techtown.softsquared_baemin.src.main.location

import android.content.Intent
import android.location.Geocoder
import android.os.Bundle
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityInputLocationBinding
import org.techtown.softsquared_baemin.src.main.map.MapActivity

class InputLocationActivity :
        BaseActivity<ActivityInputLocationBinding>(ActivityInputLocationBinding::inflate){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val geocoder = Geocoder(this)

        binding.activityInputLocationBack.setOnClickListener {
            finish()
        }


        binding.activityInputLocationSearch.setOnClickListener {
            val location = binding.activityInputLocationInput.text
            // 주소명

            val cor = geocoder.getFromLocationName(location.toString(), 1)
            val latitude = cor[0].latitude // 위도
            val longitude = cor[0].longitude // 경도

            val intent = Intent(applicationContext, MapActivity::class.java)
            intent.putExtra("latitude", latitude)
            intent.putExtra("longitude", longitude)

            val editor = sSharedPreferences.edit()
            editor.putString("location", location.toString())
            editor.apply()


            startActivity(intent)
            finish()

        }


    }


}