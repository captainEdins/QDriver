package com.safi.driver.startUp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.authentication.Login
import com.safi.driver.databinding.ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    lateinit var binding : ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun next(view: android.view.View) {
        startActivity(Intent(this,Login::class.java))
        finish()
    }
}