package com.natiqhaciyef.clot_mobile.view.screen.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.natiqhaciyef.clot_mobile.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}