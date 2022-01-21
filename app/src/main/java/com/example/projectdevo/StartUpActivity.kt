package com.example.projectdevo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_up)

        val logInBtn = findViewById<Button>(R.id.btnLogIn)
        logInBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val signUpBtn = findViewById<Button>(R.id.btnSignUp)
        signUpBtn.setOnClickListener{
                val intent = Intent(this, SignUpScrollActivity::class.java)
                startActivity(intent)
        }
    }
}