package com.safi.driver.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityForgetPasswordBinding
import com.safi.driver.databinding.ActivityLoginBinding

class ForgetPassword : AppCompatActivity() {
    lateinit var binding : ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}