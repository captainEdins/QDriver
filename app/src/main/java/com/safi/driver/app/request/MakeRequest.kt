package com.safi.driver.app.request

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityHolderBinding
import com.safi.driver.databinding.ActivityMakeRequestBinding

class MakeRequest : AppCompatActivity() {
    lateinit var binding : ActivityMakeRequestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}