package com.example.animationlearn.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.airbnb.lottie.LottieAnimationView
import com.example.animationlearn.R
import com.example.animationlearn.adapter.ViewPagerAdapter
import com.example.animationlearn.fragment.ViewPagerFragment
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var buttonJson: Button
    private lateinit var buttonAnim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        buttonAnim = findViewById(R.id.btn_custom_anim)
        buttonAnim.setOnClickListener {
            callCustomAnimActivity()
        }

        buttonJson = findViewById(R.id.btn_json_anim)
        buttonJson.setOnClickListener {
            callJsonActivity()
        }
    }

    private fun callCustomAnimActivity() {
        startActivity(Intent(this, CustomAnimActivity::class.java))
    }

    private fun callJsonActivity() {
        startActivity(Intent(this, JsonActivity::class.java))
    }
}