package com.example.projectdevo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_scroll)

        val actionBar= supportActionBar
        actionBar!!.title = "Log In"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}