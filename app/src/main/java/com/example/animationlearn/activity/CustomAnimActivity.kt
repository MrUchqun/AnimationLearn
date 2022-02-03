package com.example.animationlearn.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.example.animationlearn.R

class CustomAnimActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var buttonBounce: Button
    private lateinit var buttonSequential: Button
    private lateinit var buttonTogether: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_anim)
        initViews()
    }

    private fun initViews() {
        imageView = findViewById(R.id.iv_anim)
        buttonBounce = findViewById(R.id.btn_bounce)
        buttonSequential = findViewById(R.id.btn_sequential)
        buttonTogether = findViewById(R.id.btn_together)

        buttonBounce.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext,R.anim.bounce))
        }

        buttonSequential.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext,R.anim.sequential))
        }

        buttonTogether.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(applicationContext,R.anim.together))
        }

    }
}