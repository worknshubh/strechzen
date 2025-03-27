package com.example.strechzen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class getstartedScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_getstarted_screen)
        var getstartedbtn = findViewById<Button>(R.id.getstartedbtn)
        getstartedbtn.setOnClickListener {
            startActivity(Intent(this,loginScreen::class.java))
            finish()
        }

    }
}