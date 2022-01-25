package com.example.projectdevo

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.projectdevo.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // code for the textview sign up
        val signUpTV: TextView = view.findViewById(R.id.TVSignUpLink)
        signUpTV.setOnClickListener {
            val signUpFragment = SignUpFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.main_fragment, signUpFragment)?.commit()
        }
        return view
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentLoginBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        emailFocusListener()
        passwordFocusListener()

        binding.btnLogIn2.setOnClickListener {loginForm()}

    }

    private fun loginForm(){
        binding.emailContainer.helperText = validEmail()
        binding.passwordContainer.helperText = validPassword()

        val validEmail = binding.emailContainer.helperText == null
        val validPassword = binding.passwordContainer.helperText == null

       // if(validEmail && validPassword)
         //   resetForm()
       // else
       //     invalidForm()
    }


    private fun emailFocusListener(){
        binding.emailEdittext.setOnFocusChangeListener { _, focused ->
            if(!focused){
                binding.emailContainer.helperText = validEmail()
            }
        }
    }
    private fun validEmail():String?
    {
        val emailText = binding.emailEdittext.text.toString()
        if(!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
            return "Invalid Email Address"
        }


        return null

    }

    private fun passwordFocusListener(){
        binding.passwordEdittext.setOnFocusChangeListener { _, focused ->
            if(!focused){
                binding.passwordContainer.helperText = validPassword()
            }
        }
    }
    private fun validPassword():String?
    {
        val passwordText = binding.passwordEdittext.text.toString()
        if(passwordText.length<8){
            return "Minimum 8 Character Password"
        }
        if(!passwordText.matches(".*[A-Z]*.".toRegex())){
            return "Must Contain 1 Upper-Case Character"
        }
        if(!passwordText.matches(".*[a-z]*.".toRegex())){
            return "Must Contain 1 Lower-Case Character"
        }
        if(!passwordText.matches(".*[@#\$%^+=]*.".toRegex())){
            return "Must Contain 1 Special Character (@#\$%^+=)"
        }

        return null

    }


   // private fun invalidForm(){
    //    var message = ""
    //    if(binding.emailContainer.helperText != null)
    //        message += "\n\nEmail:"+ binding.emailContainer.helperText
    //    if(binding.passwordContainer.helperText != null)
    //        message += "\n\nPassword:"+ binding.passwordContainer.helperText

    //    AlertDialog.Builder(this)
    //        .setTitle("Form")
    //        .setMessage(message)
    //        .setPositiveButton("Okay"){_,_ ->
    //        }.show()
    //}

   // private fun resetForm(){
    //    var message =  "Email:"+ binding.emailEdittext.text
    //    message += "\nPassword:"+ binding.passwordEdittext.text

    //    AlertDialog.Builder(this)
     //       .setTitle("Form Submitted")
     //       .setMessage(message)
     //       .setPositiveButton("Okay"){_,_ ->
     //           binding.emailEdittext.text = null
     //           binding.passwordEdittext.text = null

     //           binding.emailContainer.helperText = getString(R.string.required)
     //       }.show()
    //}
}



