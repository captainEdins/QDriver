package com.safi.driver.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityForgetPasswordBinding
import com.safi.driver.databinding.ActivityResetPasswordBinding

class ResetPassword : AppCompatActivity() {
    lateinit var binding : ActivityResetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}