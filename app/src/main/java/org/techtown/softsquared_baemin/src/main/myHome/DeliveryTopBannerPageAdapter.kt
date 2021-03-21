package org.techtown.softsquared_baemin.src.main.myHome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.fragment_my_home_frm_delivery_top_banner.view.*
import org.techtown.softsquared_baemin.R

class DeliveryTopBannerPageAdapter(private val items : ArrayList<Int>) : PagerAdapter(){

    override fun getCount(): Int = 8

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.fragment_my_home_frm_delivery_top_banner, container, false)

        view.fragment_delivery_top_banner_index.text = "${position + 1} / ${items.size} 모두보기"
        view.fragment_delivery_top_banner_img.setImageResource(items[position])

        container.addView(view)
        return view
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as View
    }


}