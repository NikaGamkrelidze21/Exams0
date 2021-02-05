package com.example.exams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up.imageButton
import kotlinx.android.synthetic.main.activity_sign_up.loginin_signup


class SignUp : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        init()

        checkOutButton11.setOnClickListener() {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        loginin_signup.setOnClickListener {
            val intent = Intent(this, aythentication::class.java)
            startActivity(intent)
        }
        settingButton11.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

    }

    private fun init(){
        auth = Firebase.auth
        SignUpButton2.setOnClickListener {
            signUp()
        }
    }

    private fun signUp() {
        val email: String = Email.text.toString()
        val password: String = Password.text.toString()
        val confirmpassword: String = ConfirmPassword.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty() && confirmpassword.isNotEmpty()) {
            if (password == confirmpassword) {
                ProgressBar.visibility = View.VISIBLE
                SignUpButton2.isClickable = false
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        ProgressBar.visibility = View.GONE
                        if (task.isSuccessful) {
                            Log.d("sign up", "createUserWithEmail:success")
                            Toast.makeText(this, "SignUp is Success!", Toast.LENGTH_SHORT).show()
                        } else {
                            Log.d("sign up", "createUserWithEmail:failure", task.exception)
                            Toast.makeText(
                                this, "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            } else {
                Toast.makeText(this, "password must be same", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "please fill all fields!", Toast.LENGTH_SHORT).show()
        }

    }
}