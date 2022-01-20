package com.example.projectdevo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_up)

        val LogInBtn = findViewById<Button>(R.id.btnLogIn)
        LogInBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val SignUpBtn = findViewById<Button>(R.id.btnSignUp)
        SignUpBtn.setOnClickListener{
                val intent = Intent(this, SignUpScrollActivity::class.java)
                startActivity(intent)
        }
    }
}