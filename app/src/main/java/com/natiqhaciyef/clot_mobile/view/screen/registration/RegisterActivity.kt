package com.natiqhaciyef.clot_mobile.view.screen.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.natiqhaciyef.clot_mobile.R
import com.natiqhaciyef.clot_mobile.databinding.ActivityRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}