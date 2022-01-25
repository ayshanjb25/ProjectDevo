package com.example.projectdevo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class StartUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start_up, container, false)
        val logInBtn:Button  = view.findViewById(R.id.btnLogIn)
        val signUpBtn:Button  = view.findViewById(R.id.btnSignUp)

        // when log in button is clicked moves to login fragment
        logInBtn.setOnClickListener{
            val logInFragment = LoginFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.main_fragment,logInFragment)?.commit()
        }

        // when sign up button is clicked moves to signup fragment
        signUpBtn.setOnClickListener{
            val signUpFragment = SignUpFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.main_fragment,signUpFragment)?.commit()
        }
        return view
    }


}