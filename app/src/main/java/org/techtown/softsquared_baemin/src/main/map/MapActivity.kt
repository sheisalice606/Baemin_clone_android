package org.techtown.softsquared_baemin.src.main.map

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import android.util.Log
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_map.*
import org.json.JSONObject
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivityMapBinding
import org.techtown.softsquared_baemin.src.main.location.inputLocation.InputLocationResponse
import org.techtown.softsquared_baemin.src.main.location.inputLocation.InputLocationService
import org.techtown.softsquared_baemin.src.main.location.inputLocation.InputLocationView

class MapActivity : BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate),
        OnMapReadyCallback, InputLocationView {

    var latitude : Double = 0.0
    var longitude : Double = 0.0
    var location : String = "location"
    var address : String = "address"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.activityMapBack.setOnClickListener {
            finish()
        }


        val intent = intent

//https://dev.enudgu.shop/app/users/useraddress?address=필동&longitude=126.9955995&latitude=37.56016408&addressDetail=402동192호
//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Ijg4cWF6czJAbmF2ZXIuY29tIiwidXNlckluZGV4IjoxOSwibmlja25hbWUiOiLrrLTrgbzriITrgbwiLCJpYXQiOjE2MTcwMzI4NTMsImV4cCI6MTY0ODU2ODg1Mywic3ViIjoidXNlckluZm8ifQ.lpPAM1jjIx8bZ8wVmrehDU9hTqyPEMUSRx-HAFXsETg

        location = sSharedPreferences.getString("location", "blank").toString() // 주소
        latitude = intent.getDoubleExtra("latitude", 0.0) // 위도
        longitude = intent.getDoubleExtra("longitude", 0.0) // 경도


        binding.activityMapNext.setOnClickListener {

            address = binding.activityMapInput.text.toString() // 상세주소

            InputLocationService(this).tryInputLocation(
                    location, longitude, latitude, address
            ) // API 호출

        }




        val maps = supportFragmentManager.findFragmentById(R.id.activity_map_map) as SupportMapFragment
        maps.getMapAsync(this)

    }





    override fun onMapReady(googleMap: GoogleMap?) {

        val myLocation = LatLng(latitude, longitude)
        googleMap?.addMarker(MarkerOptions().position(myLocation))
        googleMap?.moveCamera(CameraUpdateFactory.newLatLng(myLocation))
        googleMap?.moveCamera(CameraUpdateFactory.zoomTo(15f))

    }


    override fun onInputLocationSuccess(response: InputLocationResponse) {

    }

    override fun onInputLocationFailure(message: String) {
        showCustomToast(message)
    }


}