package com.example.projectdevo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpTV = findViewById<TextView>(R.id.TVSignUpLink)
        signUpTV.setOnClickListener{
            val intent = Intent(this, SignUpScrollActivity::class.java)
            startActivity(intent)
        }
    }
}