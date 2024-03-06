package com.example.recipebuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                },2000
            )
    }
}