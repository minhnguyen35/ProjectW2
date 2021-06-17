package com.example.mygridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
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
        val userBox = findViewById<EditText>(R.id.username)
        //val passBox = findViewById<EditText>(R.id.password)

        val i = Intent(this, ProfileActivity::class.java).apply {
            putExtra(MainActivity.KEY, userBox.text.toString())
        }
        startActivity(i)
    }
}