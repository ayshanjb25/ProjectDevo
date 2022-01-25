package com.example.projectdevo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.ActionMode
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.projectdevo.databinding.FragmentLoginBinding
import com.example.projectdevo.databinding.FragmentSignUpBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.main_fragment,StartUpFragment()).commit()


    }




}

