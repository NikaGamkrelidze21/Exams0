package com.example.exams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_aythentication.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imageButton

class aythentication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aythentication)



        checkOutButton_aut.setOnClickListener() {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        loginin_aut.setOnClickListener {
            val intent = Intent(this, aythentication::class.java)
            startActivity(intent)
        }
        settingButton_aut.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
        loginbut.setOnClickListener {
           val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
       }
//        SignUpButton_aut.setOnClickListener {
//            val intent = Intent(this, SignUp::class.java)
//            startActivity(intent)
//        }
        SignUpButton_aut.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }

    fun goToLogin(view: View) {}
}

