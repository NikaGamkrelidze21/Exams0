package com.example.exams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_photo.*
import kotlinx.android.synthetic.main.activity_first_photo.imageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_photo2.*

class FirstPhoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_photo)
        init()
    }

    private fun init() {


        checkOutButton1.setOnClickListener() {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        loginin_1.setOnClickListener {
            val intent = Intent(this, aythentication::class.java)
            startActivity(intent)
        }
        settingButton_1.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }
}