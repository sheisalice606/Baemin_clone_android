package org.techtown.softsquared_baemin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseActivity
import org.techtown.softsquared_baemin.databinding.ActivitySignUpBinding

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(ActivitySignUpBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var next_state : Boolean = false
        // 다음단계 진행 가능여부

        binding.activitySignUpBack.setOnClickListener {
            finish()
        }
        // SignUpActivity 종료

        binding.activitySignUpNext.setOnClickListener { // 다음 단계로 넘어가기
            if(next_state) {
                val intent = Intent(applicationContext, SignUpPhoneActivity::class.java)
                startActivity(intent)
            }
        }


        binding.activitySignUpCheckAll.setOnClickListener { // 전체 동의

            if(binding.activitySignUpCheckAll.isChecked) {
                binding.activitySignUpCheck1.isChecked = true
                binding.activitySignUpCheck2.isChecked = true
                binding.activitySignUpCheck3.isChecked = true
                binding.activitySignUpCheck4.isChecked = true
                binding.activitySignUpCheck5.isChecked = true
                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_checked))
                next_state = true
            }else {
                binding.activitySignUpCheck1.isChecked = false
                binding.activitySignUpCheck2.isChecked = false
                binding.activitySignUpCheck3.isChecked = false
                binding.activitySignUpCheck4.isChecked = false
                binding.activitySignUpCheck5.isChecked = false
                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_unchecked))
                next_state = false
            }

        }


        binding.activitySignUpCheck1.setOnClickListener { // 필수 약관 1

            if(binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked) { // 필수약관 전체 동의상태

                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_checked))
                next_state = true

            } else {
                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_unchecked))
                next_state = false
            }


            binding.activitySignUpCheckAll.isChecked = (binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked
                    && binding.activitySignUpCheck4.isChecked
                    && binding.activitySignUpCheck5.isChecked)

        }


        binding.activitySignUpCheck2.setOnClickListener { // 필수 약관 2

            if(binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked) { // 필수약관 전체 동의상태

                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_checked))
                next_state = true
            } else {
                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_unchecked))
                next_state = false
            }

            binding.activitySignUpCheckAll.isChecked = (binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked
                    && binding.activitySignUpCheck4.isChecked
                    && binding.activitySignUpCheck5.isChecked)

        }


        binding.activitySignUpCheck3.setOnClickListener { // 필수 약관 3

            if(binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked) { // 필수약관 전체 동의상태

                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_checked))
                next_state = true
            } else {
                binding.activitySignUpNext.setBackgroundDrawable(resources.getDrawable(R.drawable.frgment_sign_up_next_button_unchecked))
                next_state = false
            }

            binding.activitySignUpCheckAll.isChecked = (binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked
                    && binding.activitySignUpCheck4.isChecked
                    && binding.activitySignUpCheck5.isChecked)

        }



        binding.activitySignUpCheck4.setOnClickListener { // 선택 약관 1

            binding.activitySignUpCheckAll.isChecked = (binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked
                    && binding.activitySignUpCheck4.isChecked
                    && binding.activitySignUpCheck5.isChecked)

        }

        binding.activitySignUpCheck5.setOnClickListener { // 선택 약관 2

            binding.activitySignUpCheckAll.isChecked = (binding.activitySignUpCheck1.isChecked
                    && binding.activitySignUpCheck2.isChecked
                    && binding.activitySignUpCheck3.isChecked
                    && binding.activitySignUpCheck4.isChecked
                    && binding.activitySignUpCheck5.isChecked)

        }


    }

}