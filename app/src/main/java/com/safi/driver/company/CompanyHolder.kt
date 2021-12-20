package com.safi.driver.company

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safi.driver.databinding.ActivityCompanyHolderBinding
import com.safi.driver.databinding.ActivityMakeRequestBinding

class CompanyHolder : AppCompatActivity() {
    lateinit var binding : ActivityCompanyHolderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}