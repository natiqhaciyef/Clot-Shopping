package com.natiqhaciyef.clot_mobile.view.screen

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.natiqhaciyef.clot_mobile.databinding.ActivitySplashBinding
import com.natiqhaciyef.clot_mobile.view.screen.home.MainActivity
import com.natiqhaciyef.clot_mobile.view.screen.registration.RegisterActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            if (auth.currentUser != null)
                changeActivity(this@SplashActivity, MainActivity())
            else
                changeActivity(this@SplashActivity, RegisterActivity())
        }


        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    private fun changeActivity(context: Context, rotation: Activity) {
        val intent = Intent(context, rotation::class.java)
        startActivity(intent)
        finish()
    }
}