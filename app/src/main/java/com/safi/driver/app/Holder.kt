package com.safi.driver.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityHolderBinding
import com.safi.driver.databinding.ActivityResetPasswordBinding

class Holder : AppCompatActivity() {
    lateinit var binding : ActivityHolderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}