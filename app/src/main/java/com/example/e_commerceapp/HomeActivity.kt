package com.example.e_commerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        button intent
        val text = findViewById<TextView>(R.id.back_intent)

        text.setOnClickListener {
            val try_intent = Intent(this, SplashActivity::class.java)
            startActivity(try_intent)
        }

    }
}