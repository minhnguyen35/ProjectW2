package com.example.mygridview

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.mygridview.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private lateinit var requestPermissionLauncher: ActivityResultLauncher<String>
    private val REQUEST_IMAGE_CAPTURE = 1
    private var username:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
//        binding.takePictureBtn.setOnClickListener {
//            requestPermission()
//        }
//        binding.nextBtn.setOnClickListener {
//            nextActivity()
//        }
        binding.click = this
        binding.profile = "Profile Updates"
        requestPermissionLauncher =
            registerForActivityResult(
                ActivityResultContracts.RequestPermission()
            ) { isGranted: Boolean ->
                if (isGranted) {
                    takePicture()
                } else {
                    Toast.makeText(this, "Can not take a picture", Toast.LENGTH_SHORT).show()
                }
            }
        username = intent.getStringExtra(MainActivity.KEY).toString()

    }
    private fun saveUser(){
        val sharedPref = getSharedPreferences("user",Context.MODE_PRIVATE)
        with (sharedPref.edit()) {
            this.clear()
            putString(MainActivity.KEY, username)
            apply()
        }

    }
    fun nextActivity() {

        saveUser()
        startActivity(Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
    }

    fun requestPermission() {
        when (PackageManager.PERMISSION_GRANTED) {
            ContextCompat.checkSelfPermission(
                this, android.Manifest.permission.CAMERA
            ) -> {
                takePicture()
            }
            else -> {
                requestPermissionLauncher.launch(android.Manifest.permission.CAMERA)
            }
        }
    }

    private fun takePicture() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val thumbnail: Bitmap? = data?.getParcelableExtra("data")
            if (thumbnail != null) binding.imageView.setImageBitmap(thumbnail)
        }
    }

}