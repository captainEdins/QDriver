package com.safi.driver.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityLandingPageBinding
import com.safi.driver.databinding.ActivityLoginBinding
import com.safi.driver.startUp.LandingPage

class Login : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun forgotPassword(view: android.view.View) {
        startActivity(Intent(this, ForgetPassword::class.java))
        finish()
    }
}