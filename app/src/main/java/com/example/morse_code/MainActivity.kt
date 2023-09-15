package com.example.morse_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }


}

