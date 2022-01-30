package com.example.animationlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import androidx.viewpager.widget.ViewPager
import com.airbnb.lottie.LottieAnimationView
import com.example.animationlearn.adapter.ViewPagerAdapter
import com.example.animationlearn.fragment.ViewPagerFragment
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var lottieAnimationView: LottieAnimationView
    private lateinit var viewPager: ViewPager
    private lateinit var dotsIndicator: DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        lottieAnimationView = findViewById(R.id.lottie_anim_view_first)
        lottieAnimationView.setAnimation("anim_one_telegram.json")
        // or // lottieAnimationView.setAnimation(R.raw.anim_one_telegram)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_first_one, R.string.page_first_two))
        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_second_one, R.string.page_second_two))
        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_third_one, R.string.page_third_two))
        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_fourth_one, R.string.page_fourth_two))
        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_fifth_one, R.string.page_fifth_two))
        adapter.addFragment(ViewPagerFragment().newInstance(R.string.page_sixth_one, R.string.page_sixth_two))

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                lottieAnimationView.apply {
                    setAnimation(
                        when (position) {
                            1 -> "anim_two_fast.json" // or // R.raw.anim_two_fast
                            2 -> "anim_three_gift.json" // or // R.raw.anim_three_gift
                            3 -> "anim_four_infinite.json" // or // R.raw.anim_four_infinite
                            4 -> "anim_five_secure.json" // or // R.raw.anim_five_secure
                            5 -> "anim_six_cloud.json" // or // R.raw.anim_six_cloud
                            else -> "anim_one_telegram.json" // or // R.raw.anim_one_telegram
                        }
                    )
                    playAnimation()
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        dotsIndicator = findViewById(R.id.dots_indicator)
        dotsIndicator.setViewPager(viewPager)

    }
}