package com.example.mygridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mygridview.databinding.ActivitySignUpBinding


class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySignUpBinding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)
        binding.viewmodel = SignUpModel("My Library", "Welcome New User!")
        binding.handleClick = this
    }

    fun signUpClick(){
        Toast.makeText(this,"sign up ok",Toast.LENGTH_SHORT).show()
        //val i = Intent(this,MainActivity.javaClass)
        //startActivity(i)
    }
}